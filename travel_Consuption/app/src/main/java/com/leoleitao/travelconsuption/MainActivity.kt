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

    private fun isValid():Boolean{
        return (binding.editDitancia.text.toString() != ""
                && binding.editPreco.text.toString() != ""
                && binding.editAutonomia.text.toString() != ""
                && binding.editAutonomia.text.toString().toFloat() != 0f)
    }
    private fun calculate(){
        if (isValid()){
            val distance = binding.editDitancia.text.toString().toFloat()
            val price = binding.editPreco.text.toString().toFloat()
            val autonomy = binding.editAutonomia.text.toString().toFloat()

            val totalValue = (price*distance)/autonomy



            binding.textResu.text = "R$ ${"%.2f".format(totalValue)}"
        }else{
            Toast.makeText(this, "Preencha todos os campos com valores validos", Toast.LENGTH_LONG).show()
        }


    }


}