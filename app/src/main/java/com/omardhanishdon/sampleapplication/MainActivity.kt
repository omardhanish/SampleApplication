package com.omardhanishdon.sampleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

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

        findViewById<Button>( R.id.showList).setOnClickListener {
            val i = Intent(this , ListActivity::class.java)
            startActivity(i)
        }

    }

}
