package com.omardhanishdon.sampleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

// inheritance
class MainActivity : AppCompatActivity() {

    // method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.rahul).text = "Click here to go to secondActivity!!!"

        findViewById<TextView>(R.id.rahul).setOnClickListener {
            val i = Intent(this , SecondActiviy::class.java)
            startActivity(i)
        }

    }

}
