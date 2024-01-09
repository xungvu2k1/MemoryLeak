package com.example.memoryleak

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this, MainActivity2::class.java).also{
            startActivity(it)
        }
    }
    // thuộc về class, context này được khởi tạo bên mainactivity2,
    // tham chiếu đến mainactivity2 => khi nhấn back thì mainactivity2 ko được thu hồi
    //gây ra memoryleak
    companion object{
        var context: Context? = null
    }
}