package net.denis.banka.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.denis.banka.data.interfaces.IResourceRepository
import javax.inject.Inject

class ResourceRepository @Inject constructor(

) : IResourceRepository {
    override suspend fun findScrap(): Flow<Int> {
        return flow {
            emit(500)
        }
    }

    override suspend fun findOil(): Flow<Int> {
        return flow {
            emit(100)
        }
    }
}