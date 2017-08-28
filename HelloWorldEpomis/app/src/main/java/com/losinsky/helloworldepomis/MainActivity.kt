package com.losinsky.helloworldepomis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutMe.setOnClickListener{
            val intent = Intent(this,AboutMe::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener{
            exitProcess(1)
        }
    }
}