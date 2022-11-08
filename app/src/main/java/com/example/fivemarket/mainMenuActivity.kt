package com.example.fivemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fivemarket.databinding.ActivityMainMenuBinding
import com.example.fivemarket.databinding.ActivityMainScreenBinding

class mainMenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}