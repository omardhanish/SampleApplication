package com.omardhanishdon.sampleapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_activity.*

class ListActivity  : AppCompatActivity() {

    // public variable

    // val variable once set cannot change - immutable
    val name = "Rahul"
    // changable --- mutable
    var age = 18
    var decimalnumber = 16.45

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        // creating object
        val adapter = listAdapter(this)
        val manager  = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)

        val listRecycle = findViewById<RecyclerView>(R.id.list)
        listRecycle.layoutManager = manager
        listRecycle.adapter = adapter



        val someNumber = returnSomeNUmber(60 , 30)

    }


    fun returnSomeNUmber(n : Int , s : Int) : Int {

        return  n + s
    }


    override fun onStart() {
        super.onStart()

        // age changed from 18 to 20
        age = 20
    }

}