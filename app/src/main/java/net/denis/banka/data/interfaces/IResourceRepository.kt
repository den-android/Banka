package net.denis.banka.data.interfaces

import kotlinx.coroutines.flow.Flow

interface IResourceRepository {
    suspend fun findScrap(): Flow<Int>
    suspend fun findOil(): Flow<Int>
}