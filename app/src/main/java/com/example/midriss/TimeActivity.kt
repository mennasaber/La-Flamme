package com.example.midriss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        val b = findViewById<Button>(R.id.startExamButton)
        b.setOnClickListener {
            startActivity(Intent(this, DataEnterActivity::class.java))
        }
    }
}