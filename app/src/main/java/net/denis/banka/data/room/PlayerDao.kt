package net.denis.banka.data.room

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import net.denis.banka.data.model.PlayerEntity

@Dao
interface PlayerDao {
    @Insert(onConflict = IGNORE)
    suspend fun addNewPlayer(playerEntity: PlayerEntity)

    @Update
    suspend fun updatePlayer(playerEntity: PlayerEntity)

    @Delete
    suspend fun deletePlayer(playerEntity: PlayerEntity)

    @Query("SELECT * FROM 'player_table' WHERE id==:id")
    fun loadPlayerById(id: Int): PlayerEntity
}