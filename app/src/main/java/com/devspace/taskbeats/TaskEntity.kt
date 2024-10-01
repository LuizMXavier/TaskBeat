package com.devspace.taskbeats

import android.util.Log
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val category: String,
    val name: String
)