package com.quanda.moviedb.data.model

import com.quanda.moviedb.data.model.factory.createUser
import com.quanda.moviedb.data.model.factory.createUserEntity
import org.junit.Before
import org.junit.Test

class UserMapperTest {
    lateinit var userEntityMapper: UserEntityMapper

    @Before
    fun setup() {
        userEntityMapper = UserEntityMapper()
    }

    @Test
    fun mapEntityToDomain() {
        // generate entity
        val entity = createUserEntity()
        // mapper
        val model = userEntityMapper.mapToDomain(entity)

        assert(entity.id == model.id)
        assert(entity.name == model.name)
        assert(entity.username == model.username)
        assert(entity.address == model.address)
        assert(entity.email == model.email)
        assert(entity.phone == model.phone)
    }

    @Test
    fun mapDomainToEntityTest() {
        // generate model
        val model = createUser()
        // mapper
        val entity = userEntityMapper.mapToEntity(model)

        assert(entity.id == model.id)
        assert(entity.name == model.name)
        assert(entity.username == model.username)
        assert(entity.address == model.address)
        assert(entity.email == model.email)
        assert(entity.phone == model.phone)
    }
}