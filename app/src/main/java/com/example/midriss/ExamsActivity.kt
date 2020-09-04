package com.example.midriss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ExamsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exams)
        val b = findViewById<Button>(R.id.button2)
        b.setOnClickListener {
            startActivity(Intent(this, TimeActivity::class.java))
        }
    }
}