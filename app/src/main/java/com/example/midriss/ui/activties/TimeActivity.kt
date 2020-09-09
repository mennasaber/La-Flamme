package com.example.midriss.ui.activties

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.midriss.R

class TimeActivity : AppCompatActivity() {
    var examCode = 0
    var examId = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        examCode = intent.getIntExtra("examCode", 0)
        examId = intent.getIntExtra("examId", 0)
        initWidget()
    }

    private fun initWidget() {
        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)
        when (examId) {
            1 -> {
                detailsTextView.text = resources.getString(R.string.details_exam1)
            }
            2 -> {
                detailsTextView.text = resources.getString(R.string.details_exam2)
            }
            3 -> {
                detailsTextView.text = resources.getString(R.string.details_exam3)
            }
            4 -> {
                detailsTextView.text = resources.getString(R.string.details_exam4)
            }
            5 -> {
                detailsTextView.text = resources.getString(R.string.details_exam5)
            }
        }

        val startButton = findViewById<Button>(R.id.startExamButton)
        startButton.setOnClickListener {
            val intent = Intent(this, DataEnterActivity::class.java)
            intent.putExtra("examCode", examCode)
            startActivity(intent)
        }
        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener { finish() }
    }
}