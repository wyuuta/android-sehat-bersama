package com.example.yuuta.sehatbersama

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.yuuta.sehatbersama.CustomAdapter.CourseListAdapter
import com.example.yuuta.sehatbersama.Object.Course
import com.example.yuuta.sehatbersama.Object.CourseList

class CourseActivity : ListActivity() {

    companion object {
        const val WORKOUT_ID = "workout_id"
        const val COURSE_LIST = "course_list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        val courseIdList = intent.getIntegerArrayListExtra(COURSE_LIST)
        val courseList = CourseList.getCourseList()
        val localCourseList = ArrayList<Course>()

        val moves = ArrayList<String>()
        val lama = ArrayList<String>()
        for (id in courseIdList) {
            localCourseList.add(courseList[id])
            moves.add(courseList[id].ambilNama())
            lama.add(courseList[id].ambilLama())
        }
        val adapter: CourseListAdapter = CourseListAdapter(this, moves, lama)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            courseDetailPage(view, localCourseList[i].ambilNama(), localCourseList[i].ambilDeskripsi())
        }
    }

    private fun setData() {
        val courseId = intent.getIntExtra(WORKOUT_ID, -1)
        val myToast = Toast.makeText(this, courseId.toString(), Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun courseDetailPage(view: View, nama: String, deskripsi: String) {
        val detailPage = Intent(this, CourseDetailActivity::class.java)
        detailPage.putExtra(CourseDetailActivity.COURSE_NAME, nama)
        detailPage.putExtra(CourseDetailActivity.COURSE_DESC, deskripsi)
        startActivity(detailPage)
    }
}
