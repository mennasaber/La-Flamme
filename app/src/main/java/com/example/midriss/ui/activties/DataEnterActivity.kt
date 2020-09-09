package com.example.midriss.ui.activties

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.midriss.R

class DataEnterActivity : AppCompatActivity() {
    var examCode = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_data)
        examCode = intent.getIntExtra("examCode", 0)
        initWidget()
    }

    private fun initWidget() {
        val backButton = findViewById<ImageView>(R.id.back)
        val startButton = findViewById<Button>(R.id.startExamButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val profEmailEditText = findViewById<EditText>(R.id.profEmailEditText)
        startButton.setOnClickListener {
            if (nameEditText.text.toString().trim()
                    .isNotEmpty() and profEmailEditText.text.toString().trim()
                    .isNotEmpty() and profEmailEditText.text.toString().trim().contains(".com")
            ) {
                val intent = Intent(this, ExamActivity::class.java)
                intent.putExtra("examCode", examCode)
                intent.putExtra("nameStu", nameEditText.text.toString().trim())
                intent.putExtra("emailProf", profEmailEditText.text.toString().trim())
                startActivity(intent)
            } else {
                if (nameEditText.text.toString().trim()
                        .isEmpty()
                )
                    nameEditText.error = "Invalid"
                if (profEmailEditText.text.toString().trim()
                        .isEmpty() or !profEmailEditText.text.toString().trim().contains(".com")
                )
                    profEmailEditText.error = "Invalid"
            }
        }
        backButton.setOnClickListener { finish() }
    }
}