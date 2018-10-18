package com.sample.clean.data.model.base

import com.sample.clean.domain.model.base.Model

interface EntityMapper<M : Model, ME : ModelEntity> {
    fun mapToDomain(entity: ME): M

    fun mapToEntity(model: M): ME
}