package com.example.midriss.ui.activties

import adapters.LessonsAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.midriss.R

class LessonsActivity : AppCompatActivity() {
    private val TAG = "LessonsActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
        initWidget()
    }

    private fun initWidget() {

        val b = findViewById<ImageView>(R.id.back)
        b.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val lessonsList = ArrayList<String>()
        lessonsList.add("Lesson 1")
        lessonsList.add("Lesson 2")
        lessonsList.add("Lesson 3")
        lessonsList.add("Lesson 4")
        lessonsList.add("Lesson 5")
        lessonsList.add("Lesson 6")
        lessonsList.add("Lesson 7")
        lessonsList.add("Lesson 8")
        lessonsList.add("Lesson 9")
        lessonsList.add("Lesson 10")
        lessonsList.add("Lesson 11")
        lessonsList.add("Lesson 12")

        val lessonsAdapter = LessonsAdapter(lessonsList = lessonsList)
        val lessonsRecyclerView = findViewById<RecyclerView>(R.id.lessonsRecyclerView)

        val screenWidth = resources.displayMetrics.widthPixels
        val itemWidth = 150 * resources.displayMetrics.density
        val numOfItem = screenWidth / itemWidth

        lessonsRecyclerView.layoutManager = GridLayoutManager(this, numOfItem.toInt());
        lessonsRecyclerView.adapter = lessonsAdapter

        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener { finish() }
    }
}