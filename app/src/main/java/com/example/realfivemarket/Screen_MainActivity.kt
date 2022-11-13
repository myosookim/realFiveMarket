package com.example.realfivemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realfivemarket.databinding.ActivityMainBinding
import com.example.realfivemarket.databinding.ActivityScreenMainBinding
import com.example.realfivemarket.databinding.FragmentMenuBinding

class Screen_MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityScreenMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreenMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}