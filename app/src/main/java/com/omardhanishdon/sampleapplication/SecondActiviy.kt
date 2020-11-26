package com.omardhanishdon.sampleapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// inheritance
class SecondActiviy : AppCompatActivity() {

    //method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_activity)

        Toast.makeText(this , "welcome to second activity", Toast.LENGTH_LONG).show()

        findViewById<TextView>(R.id.rahul).text = "Second Activity !!!"

        findViewById<TextView>(R.id.rahul).setOnClickListener {
            Toast.makeText(this , "Hi this is second activity" , Toast.LENGTH_LONG).show()
        }

    }

}