package com.example.dapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1 = findViewById<ImageButton>(R.id.imageButton1)
        val btn2 = findViewById<ImageButton>(R.id.imageButton2)
        val btn3 = findViewById<ImageButton>(R.id.imageButton3)
        val btn4 = findViewById<ImageButton>(R.id.imageButton4)
        val btn5 = findViewById<ImageButton>(R.id.imageButton5)
        val btn6 = findViewById<ImageButton>(R.id.imageButton6)

        btn1.setOnClickListener{
            val i = Intent(this, smart::class.java)
            startActivity(i)
        }
        btn2.setOnClickListener{
            val i = Intent(this, noodle::class.java)
            startActivity(i)
        }
        btn3.setOnClickListener{
            val i = Intent(this, Papa::class.java)
            startActivity(i)
        }
        btn4.setOnClickListener{
            val i = Intent(this, smart::class.java)
            startActivity(i)
        }
        btn5.setOnClickListener{
            val i = Intent(this, smart::class.java)
            startActivity(i)
        }
        btn6.setOnClickListener{
            val i = Intent(this, smart::class.java)
            startActivity(i)
        }

    }
}