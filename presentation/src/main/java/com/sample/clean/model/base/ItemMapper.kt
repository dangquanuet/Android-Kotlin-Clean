package com.sample.clean.model.base

import com.sample.clean.domain.model.base.Model

interface ItemMapper<M : Model, MI : ModelItem> {
    fun mapToPresentation(model: M): MI

    fun mapToDomain(modelItem: MI): M
}
