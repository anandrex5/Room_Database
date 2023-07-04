package com.company0ne.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("contact")
data class Contact(

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val phone: String

)


