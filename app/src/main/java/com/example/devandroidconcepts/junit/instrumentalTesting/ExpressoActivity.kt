package com.example.devandroidconcepts.junit.instrumentalTesting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.devandroidconcepts.R
import com.example.devandroidconcepts.flow.ViewModelDemoFlow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow

class ExpressoActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expresso)

        val name = findViewById<EditText>(R.id.edt_name)
        val surname = findViewById<EditText>(R.id.edt_surname)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit.setOnClickListener {
            val msg = "${name.text}    ${surname.text}"
             val intent = Intent(this,SecondActivity::class.java)
             intent.putExtra("KEY",msg)
             startActivity(intent)
        }
    }
}