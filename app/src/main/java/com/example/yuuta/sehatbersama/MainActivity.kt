package com.example.yuuta.sehatbersama

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun coursePage(id: Int) {
        val courseIntent = Intent(this, CourseActivity::class.java)
        courseIntent.putExtra(CourseActivity.WORKOUT_ID, id)

        startActivity(courseIntent)
    }

    fun chestCourse(view: View) {
        coursePage(1)
    }

    fun absCourse(view: View) {
        coursePage(2)
    }

    fun armCourse(view: View) {
        coursePage(3)
    }

    fun legCourse(view: View) {
        coursePage(4)
    }

    fun shoulderCourse(view: View) {
        coursePage(5)
    }

}
