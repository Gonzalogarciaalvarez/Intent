package com.gon.anko

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle.*

class Detalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)


        val a = intent.getIntExtra("a",0)
        val b = intent.getIntExtra("b",0)





        Salir.setOnClickListener {
            val suma = a +b
            val data = Intent()
            data.putExtra("suma",suma)
            setResult(Activity.RESULT_OK, data)
            finish()
        }


    }
}
