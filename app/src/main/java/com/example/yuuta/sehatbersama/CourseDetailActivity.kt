package com.example.yuuta.sehatbersama

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.youtube.player.*

class CourseDetailActivity : YouTubeBaseActivity() {

    companion object {
        const val COURSE_NAME = "course_name"
        const val COURSE_DESC = "course_desc"
    }
    lateinit var youtubeView:YouTubePlayerView
    lateinit var onInitListen:YouTubePlayer.OnInitializedListener
    lateinit var button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)
        button = findViewById<Button>(R.id.button)
        val nama = intent.getStringExtra(COURSE_NAME)
        val deskripsi = intent.getStringExtra(COURSE_DESC)
        val textView = findViewById<TextView>(R.id.textViewDetail)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        textView.text = nama
        textViewDescription.text = deskripsi

        youtubeView = findViewById<YouTubePlayerView>(R.id.youtubeView)
        onInitListen = object: YouTubePlayer.OnInitializedListener {
            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {

            }

            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1!!.loadVideo("JDcdhTuycOI")
            }
        }
        button.setOnClickListener( object: View.OnClickListener {
            override fun onClick(p0: View?) {
                youtubeView.initialize("AIzaSyBPDIHuqNGeTvuZ0q7bRCyZoRSRNuo3B8o", onInitListen)
            }
        })
    }
}
