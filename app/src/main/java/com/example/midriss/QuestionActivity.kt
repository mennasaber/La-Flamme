package com.example.midriss

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import models.ChooseQuestion

class QuestionActivity : AppCompatActivity() {
    private lateinit var r1: RadioButton
    private lateinit var r2: RadioButton
    private lateinit var r3: RadioButton
    private lateinit var r4: RadioButton
    private lateinit var questionTextView: TextView
    private lateinit var question: ChooseQuestion
    private lateinit var chooseRadioGroup: RadioGroup

    private var answerIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        question = intent.getSerializableExtra("question") as ChooseQuestion
        answerIndex = intent.getIntExtra("answerIndex", 0)
        initWidget()
        setWidget()
    }

    private fun initWidget() {
        questionTextView = findViewById(R.id.questionTextView)
        r1 = findViewById(R.id.radioButton1)
        r2 = findViewById(R.id.radioButton2)
        r3 = findViewById(R.id.radioButton3)
        r4 = findViewById(R.id.radioButton4)
        chooseRadioGroup = findViewById(R.id.chooseRadioGroup)
    }

    private fun setWidget() {
        questionTextView.text = question.question
        r1.text = question.r1
        r2.text = question.r2
        r3.text = question.r3
        r4.text = question.r4
        chooseRadioGroup.check(chooseRadioGroup.getChildAt(answerIndex).id)
        if (answerIndex == question.correct) {
            chooseRadioGroup.getChildAt(answerIndex)
                .setBackgroundColor(resources.getColor(R.color.colorGreen))
        } else {
            chooseRadioGroup.check(chooseRadioGroup.getChildAt(question.correct).id)
            chooseRadioGroup.getChildAt(answerIndex)
                .setBackgroundColor(resources.getColor(R.color.colorRed))
            chooseRadioGroup.getChildAt(question.correct)
                .setBackgroundColor(resources.getColor(R.color.colorGreen))
        }
    }
}