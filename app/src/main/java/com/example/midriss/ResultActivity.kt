package com.example.midriss

import adapters.ResultAdapter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.Exams

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val score = intent.getSerializableExtra("score")
        val bundle = intent.getBundleExtra("BUNDLE")!!
        val answerMapBoolean = bundle.getSerializable("answerMapBoolean") as ArrayList<Boolean>
        val answerMapIndex = bundle.getSerializable("answerMapIndex") as ArrayList<Int>
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        scoreTextView.text = "Your score is : " + score.toString() + "%"
        val adapter = ResultAdapter(
            questionsList = Exams().getExam11(),
            answerMapBoolean = answerMapBoolean,
            answerMapIndex = answerMapIndex
        )
        val recycler = findViewById<RecyclerView>(R.id.resultRecyclerView)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

    }
}