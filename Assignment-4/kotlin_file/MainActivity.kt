package com.example.dapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email: EditText = findViewById(R.id.email)
        val password: EditText = findViewById(R.id.password)
        val login: Button = findViewById(R.id.button)

        login.setOnClickListener {
            val username = email.text;
            val password = password.text;
            /*Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()*/
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }



}