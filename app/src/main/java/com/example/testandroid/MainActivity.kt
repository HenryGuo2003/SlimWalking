package com.example.testandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.ImageView
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button3callAct : Button = findViewById(R.id.button3) // Long click "call for help" button and make a phone call
        button3callAct.setOnLongClickListener{
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9722950330"))
            startActivity(intent)
            true
        }

    }

}

