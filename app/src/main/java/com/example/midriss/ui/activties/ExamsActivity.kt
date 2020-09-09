package com.example.midriss.ui.activties

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.midriss.R
import kotlin.math.pow

class ExamsActivity : AppCompatActivity() {
    private var lessonId: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exams)
        lessonId = intent.getIntExtra("lessonId", 1)
        initWidget()
    }

    private fun initWidget() {
        val exam1 = findViewById<Button>(R.id.exam1)
        exam1.setOnClickListener {
            setupDialog(1, lessonId)
        }
        val exam2 = findViewById<Button>(R.id.exam2)
        exam2.setOnClickListener {
            setupDialog(2, lessonId)
        }
        val exam3 = findViewById<Button>(R.id.exam3)
        exam3.setOnClickListener {
            setupDialog(3, lessonId)
        }
        val exam4 = findViewById<Button>(R.id.exam4)
        exam4.setOnClickListener {
            setupDialog(4, lessonId)
        }
        val exam5 = findViewById<Button>(R.id.exam5)
        exam5.setOnClickListener {
            setupDialog(5, lessonId)
        }
        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener { finish() }
    }

    private fun setupDialog(examId: Int, lessonId: Int) {
        val dialog = Dialog(this)

        dialog.apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setCancelable(false)
            setContentView(R.layout.code_dialog)
            val codeEditText = findViewById<EditText>(R.id.codeEditText)
            val enterExamButton = findViewById<Button>(R.id.enterExamButton)
            val cancelExamButton = findViewById<Button>(R.id.cancelExamButton)
            enterExamButton.setOnClickListener {
                if ((lessonId.pow(examId) * 235 + (examId + lessonId)).toString() == codeEditText.text.toString()
                ) {
                    cancel()
                    val intent = Intent(context, TimeActivity::class.java)
                    intent.putExtra("examCode", (lessonId.pow(examId) * 235 + (examId + lessonId)))
                    intent.putExtra("examId", examId)
                    startActivity(intent)
                } else {
                    codeEditText.error = "Invalid code"
                    codeEditText.requestFocus()
                }
            }
            cancelExamButton.setOnClickListener { cancel() }
            show()
        }

    }
}

private fun Int.pow(lessonId: Int): Int = toDouble().pow(lessonId).toInt()
