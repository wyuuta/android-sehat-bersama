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
    lateinit var text: TextView
    lateinit var hr:String
    lateinit var mnt:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        this.context = this

        switch = findViewById<Switch>(R.id.switch1)
        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        timePicker = findViewById<TimePicker>(R.id.timePicker)
        text = findViewById<TextView>(R.id.textView3)
        var calendar = Calendar.getInstance()
        var intent = Intent(this, NotificationRecv::class.java)
        switch.setOnCheckedChangeListener {buttonView, isChecked ->
            if (isChecked) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                    calendar.set(Calendar.HOUR_OF_DAY, timePicker.hour)
                    calendar.set(Calendar.MINUTE, timePicker.minute)
                    calendar.set(Calendar.SECOND, 0)
                    calendar.set(Calendar.MILLISECOND, 0)
                    hr = timePicker.hour.toString()
                    mnt = timePicker.minute.toString()
                }
                else {
                    calendar.set(Calendar.HOUR_OF_DAY, timePicker.currentHour)
                    calendar.set(Calendar.MINUTE, timePicker.currentMinute)
                    calendar.set(Calendar.SECOND, 0)
                    calendar.set(Calendar.MILLISECOND, 0)
                    hr = timePicker.currentHour.toString()
                    mnt = timePicker.currentMinute.toString()
                }
                var temp:String = "Nyala $hr : $mnt"
                text.setText(temp)
                intent.putExtra("extra", "on")
                pi = PendingIntent.getBroadcast(this@AlarmActivity, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, 30*1000, pi)

            }
            else {
                text.setText("Mati")
                pi = PendingIntent.getBroadcast(this@AlarmActivity, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
                alarmManager.cancel(pi)
                intent.putExtra("extra","off")
                sendBroadcast(intent)
            }

        }
    }

    class NotificationRecv:BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            Log.d("Alarm", "Recieve")
            var alarmUri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
            if (alarmUri==null) {
                alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            }
            RingtoneService.r = RingtoneManager.getRingtone(p0, alarmUri)
            RingtoneService.r.play()
        }
    }
}
