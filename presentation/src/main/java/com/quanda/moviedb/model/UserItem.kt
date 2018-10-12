package com.quanda.moviedb.model

import com.quanda.moviedb.domain.model.User
import com.quanda.moviedb.model.base.ItemMapper
import com.quanda.moviedb.model.base.ModelItem

data class UserItem(
    val id: String,
    val name: String? = null,
    val username: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null
) : ModelItem()


class UserItemMapper : ItemMapper<User, UserItem> {
    override fun mapToPresentation(model: User): UserItem = UserItem(
        id = model.id,
        name = model.name,
        username = model.username,
        email = model.email,
        phone = model.phone,
        address = model.address
    )

    override fun mapToDomain(modelItem: UserItem) = User(
        id = modelItem.id,
        name = modelItem.name,
        username = modelItem.username,
        email = modelItem.email,
        phone = modelItem.phone,
        address = modelItem.address
    )
}