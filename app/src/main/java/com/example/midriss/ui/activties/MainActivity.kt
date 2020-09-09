package com.example.midriss.ui.activties

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.midriss.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<Button>(R.id.startButton)
        b.setOnClickListener {
            startActivity(Intent(this, LessonsActivity::class.java))
        }
    }
}