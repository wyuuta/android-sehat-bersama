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

    fun detailPage(id: Int) {
        val courseIntent = Intent(this, CourseActivity::class.java)
        courseIntent.putExtra(CourseActivity.WORKOUT_ID, id)

        startActivity(courseIntent)
    }

    fun chestCourse(view: View) {
        detailPage(1)
    }

    fun absCourse(view: View) {
        detailPage(2)
    }

    fun armCourse(view: View) {
        detailPage(3)
    }

    fun legCourse(view: View) {
        detailPage(4)
    }

    fun shoulderCourse(view: View) {
        detailPage(5)
    }

}
