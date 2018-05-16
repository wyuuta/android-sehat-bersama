package com.example.yuuta.sehatbersama

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

class CourseActivity : ListActivity() {

    companion object {
        const val WORKOUT_ID = "workout_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        val moves = arrayOf("JUMPING JACKS", "ABDOMINAL CRUNCHES", "RUSSIAN TWIST", "MOUNTAIN_CLIMBER", "HELL TOUCH", "LEG RAISES", "PLANK", "COBRA STRETCH", "SPINE LUMBAR TWIST STRETCH LEFT", "SPINE LUMBAR TWIST STRETCH RIGHT")
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(listView.context, android.R.layout.simple_list_item_1, moves)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            courseDetailPage(view)
        }
    }

    private fun setData() {
        val courseId = intent.getIntExtra(WORKOUT_ID, -1)
        val myToast = Toast.makeText(this, courseId.toString(), Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun courseDetailPage(view: View) {
        val detailPage = Intent(this, CourseDetailActivity::class.java)
        startActivity(detailPage)
    }
}
