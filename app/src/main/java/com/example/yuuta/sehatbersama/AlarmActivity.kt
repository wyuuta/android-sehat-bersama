package com.example.yuuta.sehatbersama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.AlarmManager
import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.support.v4.app.NotificationCompat
import android.util.Log
import android.widget.Switch
import android.widget.TextView
import android.widget.TimePicker
import java.util.*


class AlarmActivity : AppCompatActivity() {

    lateinit var switch:Switch
    lateinit var alarmManager:AlarmManager
    lateinit var timePicker:TimePicker
    lateinit var context:Context
    lateinit var pi:PendingIntent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        context = this
        switch = findViewById<Switch>(R.id.switch1)
        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        timePicker = findViewById<TimePicker>(R.id.timePicker)

        var calendar = Calendar.getInstance()
        var intent:Intent = Intent(context, NotificationReciever::class.java)
        switch.setOnCheckedChangeListener {buttonView, isChecked ->
            if (isChecked) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                    calendar.set(Calendar.HOUR_OF_DAY, timePicker.hour)
                    calendar.set(Calendar.MINUTE, timePicker.minute)
                    calendar.set(Calendar.SECOND, 0)
                    calendar.set(Calendar.MILLISECOND, 0)
                }
                else {
                    calendar.set(Calendar.HOUR_OF_DAY, timePicker.currentHour)
                    calendar.set(Calendar.MINUTE, timePicker.currentMinute)
                    calendar.set(Calendar.SECOND, 0)
                    calendar.set(Calendar.MILLISECOND, 0)
                }
                intent.putExtra("extra", "on")
                pi = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, AlarmManager.INTERVAL_DAY, pi)

            }
            else {
                pi = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
                alarmManager.cancel(pi)
                intent.putExtra("extra","off")
                sendBroadcast(intent)
            }

        }
    }
}
