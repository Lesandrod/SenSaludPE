package com.grupo1b.sensaludpe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.grupo1b.sensaludpe.databinding.ActivityPantallaBinding

class PantallaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPantallaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Inicio())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.inicio -> replaceFragment(Inicio())
                R.id.perfil -> replaceFragment(Perfil())
                R.id.recomendaciones -> replaceFragment(Recomendaciones())
                R.id.preferencias -> replaceFragment(Preferencias())
                R.id.configuracion -> replaceFragment(Configuracion())


                else ->{



                }

            }

            true

        }


    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()


    }
}