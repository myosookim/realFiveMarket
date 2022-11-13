package com.example.realfivemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realfivemarket.databinding.ActivityMyprofileBinding

class MyprofileActivity : AppCompatActivity() {
    lateinit var binding : ActivityMyprofileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyprofileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}