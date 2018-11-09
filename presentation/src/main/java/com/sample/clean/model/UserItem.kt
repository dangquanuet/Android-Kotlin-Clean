package com.sample.clean.model

import android.content.res.Resources
import com.sample.clean.R
import com.sample.clean.data.utils.toTimeLong
import com.sample.clean.data.utils.toTimeString
import com.sample.clean.domain.model.User
import com.sample.clean.model.base.ItemMapper
import com.sample.clean.model.base.ModelItem

data class UserItem(
    val id: String,
    val name: String? = null,
    val username: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null,
    val createdDate: String? = null
) : ModelItem()


class UserItemMapper(
    private val resources: Resources
) : ItemMapper<User, UserItem> {
    override fun mapToPresentation(model: User) = UserItem(
        id = model.id,
        name = model.name,
        username = model.username,
        email = model.email,
        phone = model.phone,
        address = model.address,
        createdDate = model.createdDate?.toTimeString(resources.getString(R.string.format_yyyy_MM_dd))
    )

    override fun mapToDomain(modelItem: UserItem) = User(
        id = modelItem.id,
        name = modelItem.name,
        username = modelItem.username,
        email = modelItem.email,
        phone = modelItem.phone,
        address = modelItem.address,
        createdDate = modelItem.createdDate?.toTimeLong(resources.getString(R.string.format_yyyy_MM_dd))
    )
}