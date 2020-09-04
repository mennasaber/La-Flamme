package com.example.midriss

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LessonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
        val b = findViewById<ImageView>(R.id.back)
        b.setOnClickListener {
            startActivity(Intent(this, ExamsActivity::class.java))
        }
    }
}