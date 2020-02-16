package com.example.testandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_insert_menu.*

class InsertMenu : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_menu)
        setSupportActionBar(toolbar)

        val button3callAct : Button = findViewById(R.id.button3) // Long click "call for help" button and make a phone call
        button3callAct.setOnLongClickListener{
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9722950330"))
            startActivity(intent)
            true
        }
    }

}
