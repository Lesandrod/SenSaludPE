package com.grupo1b.sensaludpe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regdir=findViewById<TextView>(R.id.registrodir)

        regdir.setOnClickListener{

            val lanzar = Intent(this,RegisterActivity::class.java)
            startActivity(lanzar)
        }

    }
}