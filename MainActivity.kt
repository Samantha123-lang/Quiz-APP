package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edit=findViewById<EditText>(R.id.myed) as EditText
        val click=findViewById<Button>(R.id.btn_start) as Button
        click.setOnClickListener {
            if(edit.text.toString().isEmpty()){
                Toast.makeText(this ,
                    "Please Enter Your Name",Toast.LENGTH_SHORT).show()

            }
            else
            {
                val intent=Intent(this, QuizQuestions::class.java)
                startActivity(intent)
                finish()

            }

        }
    }
}