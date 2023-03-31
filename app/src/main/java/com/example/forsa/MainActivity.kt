package com.example.forsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // hide the action bar
                supportActionBar?.hide()

        setContentView(R.layout.activity_main)
    }
}