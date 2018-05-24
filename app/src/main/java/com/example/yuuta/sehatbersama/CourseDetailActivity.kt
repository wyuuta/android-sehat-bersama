package com.example.yuuta.sehatbersama

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class CourseDetailActivity : YouTubeBaseActivity() {

    companion object {
        const val COURSE_NAME = "course_name"
        const val COURSE_DESC = "course_desc"
        const val COURSE_LINK = "course_link"
        const val COURSE_LAMA = "course_lama"
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
        val link = intent.getStringExtra(COURSE_LINK)
        val lama = intent.getStringExtra(COURSE_LAMA)

        val textView = findViewById<TextView>(R.id.textViewDetail)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        val textViewLama = findViewById<TextView>(R.id.textViewLama)

        textView.text = nama
        textViewDescription.text = deskripsi
        textViewLama.text = lama

        youtubeView = findViewById<YouTubePlayerView>(R.id.youtubeView)
        onInitListen = object: YouTubePlayer.OnInitializedListener {
            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {

            }

            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
                p1!!.loadVideo(link)
            }
        }
        button.setOnClickListener( object: View.OnClickListener {
            override fun onClick(p0: View?) {
                youtubeView.initialize("AIzaSyBPDIHuqNGeTvuZ0q7bRCyZoRSRNuo3B8o", onInitListen)
            }
        })
    }
}
