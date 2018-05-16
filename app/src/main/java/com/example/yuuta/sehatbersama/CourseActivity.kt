package com.example.yuuta.sehatbersama

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class CourseActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        val moves = arrayOf("JUMPING JACKS","ABDOMINAL CRUNCHES", "RUSSIAN TWIST", "MOUNTAIN_CLIMBER", "HELL TOUCH", "LEG RAISES", "PLANK", "COBRA STRETCH", "SPINE LUMBAR TWIST STRETCH LEFT", "SPINE LUMBAR TWIST STRETCH RIGHT");
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, moves);
        getListView().setAdapter(adapter);

    }
}
