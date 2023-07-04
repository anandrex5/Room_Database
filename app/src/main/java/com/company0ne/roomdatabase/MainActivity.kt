package com.company0ne.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    lateinit var dataBase: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize the property crating the instance of the database
        dataBase =
            Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB")
                .build()

        GlobalScope.launch {
            dataBase.contactDao().insertContact(Contact(0, "Anand", "100"))
//            dataBase.contactDao().deleteContact(Contact(2, "Anand", "100"))
//            dataBase.contactDao().insertContact(Contact(3, "Anand", "200"))

        }
    }
}