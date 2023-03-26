package net.denis.banka.data.model

import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.NOCASE
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "player_table")
data class PlayerEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(collate = ColumnInfo.NOCASE, name = "player_name")
    val playerName: String
)