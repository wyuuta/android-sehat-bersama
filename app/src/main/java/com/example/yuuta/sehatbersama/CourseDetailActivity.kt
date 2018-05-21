package com.example.yuuta.sehatbersama

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class CourseDetailActivity : AppCompatActivity() {

    companion object {
        const val COURSE_NAME = "course_name"
        const val COURSE_DESC = "course_desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)
        val nama = intent.getStringExtra(COURSE_NAME)
        val deskripsi = intent.getStringExtra(COURSE_DESC)
        val textView = findViewById<TextView>(R.id.textViewDetail)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        textView.text = nama
        textViewDescription.text = deskripsi

    }
}
