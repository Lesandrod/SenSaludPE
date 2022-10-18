package com.grupo1b.sensaludpe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val logdir=findViewById<TextView>(R.id.logindir)
        logdir.setOnClickListener{
            val lanzar = Intent(this,MainActivity::class.java)
            startActivity(lanzar)
        }
    }
}