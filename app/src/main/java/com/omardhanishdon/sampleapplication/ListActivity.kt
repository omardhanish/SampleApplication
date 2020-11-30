package com.omardhanishdon.sampleapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.list_activity.*

class ListActivity  : AppCompatActivity() {

    // public variable

    // val variable once set cannot change - immutable
    val name = "Rahul"
    // changable --- mutable
    var age = 18
    var decimalnumber = 16.45

    var list = mutableListOf<Information>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        // creating object
        val adapter = listAdapter(this , list)
        val manager  = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)

        val listRecycle = findViewById<RecyclerView>(R.id.list)
        listRecycle.layoutManager = manager
        listRecycle.adapter = adapter

        val nameEditText = findViewById<EditText>(R.id.name)
        val phoneEditText = findViewById<EditText>(R.id.number)
        val dateEditText = findViewById<EditText>(R.id.date)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val name = nameEditText.text.toString()
            val number = phoneEditText.text.toString()
            val date = dateEditText.text.toString()

            if(name.length == 0) {
                Toast.makeText(this , "please enter name" , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if(number.length == 0){
                Toast.makeText(this , "please enter number " , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else if (date.length == 0){
                Toast.makeText(this , "please enter date" , Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val info = Information(name , number , date)
            list.add(info)
            adapter.notifyItemInserted(list.size)
            Toast.makeText(this , "Successfully addded" , Toast.LENGTH_SHORT).show()

            nameEditText.setText("")
            phoneEditText.setText("")
            dateEditText.setText("")
        }

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

    inner class Information(var name : String , var number : String , var date : String)

}