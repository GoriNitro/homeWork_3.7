package com.example.homework_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_37.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra("key")
        binding.tvName.text = name
    }
}