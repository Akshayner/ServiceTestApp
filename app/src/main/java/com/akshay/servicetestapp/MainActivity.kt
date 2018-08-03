package com.akshay.servicetestapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play.setOnClickListener {
            val i = Intent(this@MainActivity,Audio::class.java)
            startService(i)
        }
        stop.setOnClickListener {
            val i = Intent(this@MainActivity,Audio::class.java)
            stopService(i)
        }

    }
}
