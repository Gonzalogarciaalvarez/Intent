package com.gon.anko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cambio_color.*



class CambioColor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio_color)

        val col = intent.getStringExtra("color")


        when (col) {
            "amarillo" -> {
                cambio.setText(col)
            }
            "rojo" -> {
                cambio.setText(col)
            }
            else -> print("")
        }

        bCerrar.setOnClickListener {
            finish()
        }


    }
}
