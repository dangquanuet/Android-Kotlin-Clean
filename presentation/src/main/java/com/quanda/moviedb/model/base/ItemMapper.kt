package com.quanda.moviedb.model.base

import com.quanda.moviedb.domain.model.base.Model

interface ItemMapper<M : Model, MI : ModelItem> {
    fun mapToPresentation(model: M): MI

    fun mapToDomain(modelItem: MI): M
}
