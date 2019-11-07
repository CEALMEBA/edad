package com.example.findmyage_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edad = findViewById<EditText>(R.id.txtAge)
        val boton = findViewById<Button>(R.id.btnCalcular)

        /*boton.setOnClickListener{
                view -> calcularEdad(Integer.parseInt(txtAge.text.toString()))
        }
        */
        btnCalcular.setOnClickListener{
            calcularEdad(Integer.parseInt(txtAge.text.toString()))
            clearScreen()
        }

    }

    fun calcularEdad(a: Int){
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        if (!(a.toString() != "")){
            txtResultado.setText("No input charged")
        }else{
            var res = 2019 - a
            txtResultado.setText("Su edad es :  $res")
        }
    }




    fun clearScreen(){
        val txt = findViewById<TextView>(R.id.txtAge)
        txt.setText("")
    }

}
