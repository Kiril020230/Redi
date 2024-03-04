package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my.databinding.ActivityOnboarding2Binding
import com.example.my.databinding.ActivityOnboarding3Binding

class Onboarding3 : AppCompatActivity() {
    lateinit var binding: ActivityOnboarding3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnboarding3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}