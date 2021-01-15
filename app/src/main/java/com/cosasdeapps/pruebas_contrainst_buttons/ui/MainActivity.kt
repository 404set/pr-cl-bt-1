package com.cosasdeapps.pruebas_contrainst_buttons.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cosasdeapps.pruebas_contrainst_buttons.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: View = findViewById(R.id.fab1)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "HIJOS DE PUTAAAA", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }
    }


}