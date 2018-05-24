package com.example.yuuta.sehatbersama

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_side_bar.*
import kotlinx.android.synthetic.main.app_bar_side_bar.*
import android.app.NotificationManager
import android.app.NotificationChannel
import android.os.Build



class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
        createNotificationChannel()
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

//        val toggle = ActionBarDrawerToggle(
//                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
//        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()

//        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.side_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    fun alarmPage(menuItem: MenuItem) {
        val alarmIntent = Intent(this, AlarmActivity::class.java)
        startActivity(alarmIntent)
    }

    fun coursePage(id: Int, courseList: ArrayList<Int>) {
        val courseIntent = Intent(this, CourseActivity::class.java)
        courseIntent.putExtra(CourseActivity.WORKOUT_ID, id)
        courseIntent.putExtra(CourseActivity.COURSE_LIST, courseList)

        startActivity(courseIntent)
    }

    fun chestCourse(view: View) {
        val courseList = ArrayList<Int>()
        courseList.add(0)
        courseList.add(1)
        courseList.add(2)
        courseList.add(3)
        courseList.add(4)
        courseList.add(5)
        courseList.add(6)
        courseList.add(7)
        courseList.add(8)
        courseList.add(9)
        coursePage(1, courseList)
    }

    fun absCourse(view: View) {
        val courseList = ArrayList<Int>()
        courseList.add(0)
        courseList.add(10)
        courseList.add(11)
        courseList.add(12)
        courseList.add(13)
        courseList.add(14)
        courseList.add(15)
        courseList.add(16)
        courseList.add(17)
        courseList.add(18)
        coursePage(2, courseList)
    }

    fun armCourse(view: View) {
        val courseList = ArrayList<Int>()
        courseList.add(19)
        courseList.add(20)
        courseList.add(21)
        courseList.add(22)
        courseList.add(23)
        courseList.add(24)
        courseList.add(0)
        courseList.add(25)
        courseList.add(26)
        courseList.add(27)
        courseList.add(28)
        courseList.add(29)
        courseList.add(3)
        courseList.add(30)
        courseList.add(31)
        courseList.add(32)
        courseList.add(33)
        courseList.add(34)
        courseList.add(35)
        coursePage(3, courseList)
    }

    fun legCourse(view: View) {
        val courseList = ArrayList<Int>()
        courseList.add(36)
        courseList.add(37)
        courseList.add(38)
        courseList.add(39)
        courseList.add(40)
        courseList.add(41)
        courseList.add(42)
        courseList.add(43)
        courseList.add(44)
        coursePage(4, courseList)
    }

    fun shoulderCourse(view: View) {
        val courseList = ArrayList<Int>()
        coursePage(5, courseList)
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("11", "sehatbersama", importance)
            channel.description = "channel notif sehat bersama"
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager!!.createNotificationChannel(channel)
        }
    }
}
