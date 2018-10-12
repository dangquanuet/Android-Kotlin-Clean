package com.quanda.moviedb.data.model.base

import com.quanda.moviedb.domain.model.base.Model

interface EntityMapper<M : Model, ME : ModelEntity> {
    fun mapToDomain(entity: ME): M

    fun mapToEntity(model: M): ME
}