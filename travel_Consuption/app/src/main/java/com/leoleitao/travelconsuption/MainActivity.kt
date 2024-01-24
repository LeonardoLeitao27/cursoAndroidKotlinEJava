package com.leoleitao.travelconsuption

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leoleitao.travelconsuption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        binding.editDitancia

    }

    fun calculate(){
        binding.editAutonomia
    }
}