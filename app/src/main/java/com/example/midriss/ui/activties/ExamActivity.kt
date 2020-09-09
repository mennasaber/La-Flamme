package com.example.midriss.ui.activties

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import android.widget.*
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.midriss.R
import com.example.midriss.ResultActivity
import models.ChooseQuestion
import models.Exams
import viewmodels.ExamViewModel
import java.math.RoundingMode
import java.util.concurrent.TimeUnit

class ExamActivity : AppCompatActivity() {
    private var examCode = 0
    private var processIncrease = ((1 / 25.0) * 100).toInt()
    private var questionsList = ArrayList<ChooseQuestion>()
    private val viewModel: ExamViewModel by viewModels()
    private lateinit var r1: RadioButton
    private lateinit var r2: RadioButton
    private lateinit var r3: RadioButton
    private lateinit var r4: RadioButton
    private lateinit var question: TextView
    private lateinit var questionNum: TextView
    private lateinit var chooseRadioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        );
        setContentView(R.layout.activity_exam)
        examCode = intent.getIntExtra("examCode", 0)
        initWidget()
        setupTimer()

    }

    private fun setupTimer() {
        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        val timer = object : CountDownTimer(viewModel.timeCount, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                viewModel.timeCount = millisUntilFinished
                timeTextView.text = String.format(
                    "%02d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                            TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)
                            )
                )
            }

            override fun onFinish() {
                finish()
            }
        }
        timer.start()
    }

    private fun initWidget() {
        val nextButton = findViewById<Button>(R.id.nextQuestionButton)
        question = findViewById(R.id.questionTextView)
        chooseRadioGroup = findViewById(R.id.chooseRadioGroup)
        val processBar = findViewById<ProgressBar>(R.id.questionsProgress)

        r1 = findViewById(R.id.radioButton1)
        r2 = findViewById(R.id.radioButton2)
        r3 = findViewById(R.id.radioButton3)
        r4 = findViewById(R.id.radioButton4)
        questionNum = findViewById(R.id.questionNumberTextView)

        val exam = Exams()
        questionsList = exam.getExam11()
        if (questionsList.count() != 0) {
            setWidget()
        }

        nextButton.setOnClickListener {
            val selectedRadioId = chooseRadioGroup.checkedRadioButtonId
            if (selectedRadioId != -1) {

                val answerButton = findViewById<RadioButton>(selectedRadioId)
                val answerIndex = chooseRadioGroup.indexOfChild(answerButton)

                if (answerIndex == questionsList[viewModel.currentQuestionIndex].correct) {
                    viewModel.correctCount++
                    viewModel.answerMapBoolean.add(true)
                } else
                    viewModel.answerMapBoolean.add(false)

                viewModel.answerMapIndex.add(answerIndex)
                processBar.progress += processIncrease

                if (viewModel.currentQuestionIndex + 1 != questionsList.count()) {
                    chooseRadioGroup.clearCheck()
                    viewModel.currentQuestionIndex += 1
                    setWidget()
                    if (viewModel.currentQuestionIndex == questionsList.count())
                        nextButton.text = "Result"
                } else {
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(
                        "score",
                        ((viewModel.correctCount.toDouble() / viewModel.answerMapBoolean.count()) * 100).toBigDecimal()
                            .setScale(1, RoundingMode.UP)
                    )
                    val args = Bundle()
                    args.putSerializable("answerMapBoolean", viewModel.answerMapBoolean)
                    args.putSerializable("answerMapIndex", viewModel.answerMapIndex)
                    intent.putExtra("BUNDLE", args)
                    startActivity(intent)
                    Toast.makeText(
                        this,
                        "Your score is ${((viewModel.correctCount.toDouble() / viewModel.answerMapBoolean.count()) * 100).toBigDecimal()
                            .setScale(1, RoundingMode.UP)}%",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun setWidget() {
        questionNum.text =
            resources.getString(R.string.question, viewModel.currentQuestionIndex + 1)
        question.text = questionsList[viewModel.currentQuestionIndex].question
        r1.text = questionsList[viewModel.currentQuestionIndex].r1
        r2.text = questionsList[viewModel.currentQuestionIndex].r2
        r3.text = questionsList[viewModel.currentQuestionIndex].r3
        r4.text = questionsList[viewModel.currentQuestionIndex].r4
    }

}