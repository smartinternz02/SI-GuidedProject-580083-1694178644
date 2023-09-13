package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent.ACTION_VIEW
import android.net.Uri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById(R.id.Email) as EditText
        var et_password = findViewById(R.id.Password) as EditText
        var btn_adidas = findViewById(R.id.button) as Button
        var btn_nike = findViewById(R.id.button2) as Button
        var btn_puma = findViewById(R.id.button3) as Button

        val user_name = et_user_name.text;
        val password = et_password.text;

        btn_adidas.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("https://www.adidas.co.in/")
            startActivity(openURL)
        }
        btn_nike.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("https://www.nike.com/in/")
            startActivity(openURL)
        }
        btn_puma.setOnClickListener {
            val openURL = Intent(ACTION_VIEW)
            openURL.data = Uri.parse("https://in.puma.com/in/en")
            startActivity(openURL)
        }
    }
}