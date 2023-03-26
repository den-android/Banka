package net.denis.banka.data.model

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.NOCASE
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "player_resources_table",
    foreignKeys =
    @ForeignKey(entity = PlayerEntity::class, parentColumns = "id", childColumns = "player_id")
)
data class PlayerResources(
    @ColumnInfo(collate = NOCASE, name = "player_id")
    val playerId: Int,

    @ColumnInfo(collate = NOCASE, name = "oil_count")
    val oil_count: Long,

    @ColumnInfo(collate = NOCASE, name = "scrap_count")
    val scrap_count: Long,

    @ColumnInfo(collate = NOCASE, name = "steel_count")
    val steel_count: Long,
)