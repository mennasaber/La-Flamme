package com.example.midriss.ui.activties

import adapters.ResultAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.midriss.R
import models.Exams
import java.io.Serializable

class ResultActivity : AppCompatActivity() {
    lateinit var answerMapBoolean: ArrayList<Boolean>
    lateinit var answerMapIndex: ArrayList<Int>
    lateinit var score: Serializable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        score = intent.getSerializableExtra("score")
        val bundle = intent.getBundleExtra("BUNDLE")!!
        answerMapBoolean = bundle.getSerializable("answerMapBoolean") as ArrayList<Boolean>
        answerMapIndex = bundle.getSerializable("answerMapIndex") as ArrayList<Int>
        initWidget()

    }

    private fun initWidget() {
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
        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener { finish() }
        val okButton = findViewById<Button>(R.id.okButton)
        okButton.setOnClickListener { finish() }
        val sendEmailButton = findViewById<Button>(R.id.sendEmailButton)
        sendEmailButton.setOnClickListener {
            val to = "mennasaber0193@gmailcom"
            val subject = "Test"
            val message = "Test"

            val intent = Intent(Intent.ACTION_SEND)
            val addressees = arrayOf(to)
            intent.putExtra(Intent.EXTRA_EMAIL, addressees)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "message/rfc822"
            startActivity(Intent.createChooser(intent, "Send Email using:"));
        }
    }
}