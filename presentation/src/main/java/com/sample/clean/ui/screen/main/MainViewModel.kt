package com.sample.clean.ui.screen.main

import androidx.lifecycle.MutableLiveData
import com.sample.clean.domain.usecase.user.FindUserUseCase
import com.sample.clean.model.UserItem
import com.sample.clean.model.UserItemMapper
import com.sample.clean.rx.SchedulerProvider
import com.sample.clean.ui.base.BaseViewModel

class MainViewModel(
    private val findUserUseCase: FindUserUseCase,
    private val schedulerProvider: SchedulerProvider,
    private val userItemMapper: UserItemMapper
) : BaseViewModel() {

    val user = MutableLiveData<UserItem>()

    fun start() {
        compositeDisposable.add(
            findUserUseCase.createObservable(FindUserUseCase.Params("10923841092", false))
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .map { userItemMapper.mapToPresentation(it) }
                .subscribe({
                    user.value = it
                }, {
                    errorMessage.value = it.message
                })
        )
    }
}