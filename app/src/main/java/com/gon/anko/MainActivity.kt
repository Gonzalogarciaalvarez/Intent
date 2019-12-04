package com.gon.anko

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Roj = findViewById<Button>(R.id.Rojo)
        val Ama = findViewById<Button>(R.id.Amarillo)
        val Sal = findViewById<Button>(R.id.Saludo)

        Roj.setOnClickListener {
            longToast ("Cambiaremos el color a rojo")
            startActivity(intentFor<CambioColor>("color" to "rojo"))
        }

        Ama.setOnClickListener {
            longToast ("Cambiaremos el color a amarillo")
            startActivity(intentFor<CambioColor>("color" to "amarillo"))
        }
        Sal.setOnClickListener {
            browse("https://media.giphy.com/media/8JTFsZmnTR1Rs1JFVP/giphy.gif")
        }







        startActivityForResult(miintent,1)


        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
            if(requestCode==1){
                if(resultCode == Activity.RESULT_OK){
                    if (data != null) {
                        Resultado.setText(data.getIntExtra("devolucion",0).toString())
                    }
                }
            }
        }



    }
}
