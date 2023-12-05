package com.example.homework_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, SecondFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container2, MainFragment()).commit()
    }
}