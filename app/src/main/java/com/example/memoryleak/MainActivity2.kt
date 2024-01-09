package com.example.memoryleak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MainActivity.context = this
    }

    override fun onDestroy() {
        super.onDestroy()
//        MainActivity.context = null

    }
}