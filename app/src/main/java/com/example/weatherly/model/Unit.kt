package com.example.weatherly.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.annotation.Nonnull

@Entity(tableName = "settings_tbl")
data class Unit (
    @Nonnull
    @PrimaryKey
    @ColumnInfo("unit")
    val unit: String
)