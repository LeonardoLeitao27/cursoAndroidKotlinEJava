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
        val distance = binding.editDitancia.text.toString().toFloat()
        val price = binding.editPreco.text.toString().toFloat()
        val autonomy = binding.editAutonomia.text.toString().toFloat()

        val totalValue = (price*distance)/autonomy

        
        //Toast.makeText(this, totalValueStr, Toast.LENGTH_LONG).show()
        binding.textResu.text = "R$ ${"%.2f".format(totalValue)}"

    }


}