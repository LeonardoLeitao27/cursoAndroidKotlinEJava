package com.leoleitao.travelconsuption

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.leoleitao.travelconsuption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)

    }
    override fun onClick(view: View) {
        if(view.id ==R.id.btnCalcular){
            calculate()
        }
    }

    private fun calculate(){
        Toast.makeText(this, "Você realizou um click", Toast.LENGTH_LONG).show()
    }


}