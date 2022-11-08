package com.example.fivemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fivemarket.databinding.ActivityMainScreenBinding

class mainScreenActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}