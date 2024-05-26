package com.falconteam.laboratorio_5.data.database.entity

import android.icu.text.CaseMap.Title
import java.util.UUID
import androidx.room.Entity
import androidx.room.PrimaryKey




@Entity(tableName = "posts")
data class Post(
    @PrimaryKey( autoGenerate = false)
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description : String,
    val author : String

)