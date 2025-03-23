package com.example.devandroidconcepts.junit.instrumentalTesting

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.devandroidconcepts.R

class SecondActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val msg = intent.getStringExtra("KEY")
        findViewById<TextView>(R.id.txt).text = msg.toString()
    }
}