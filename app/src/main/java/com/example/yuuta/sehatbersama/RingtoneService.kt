package com.example.yuuta.sehatbersama

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.Ringtone
import android.media.RingtoneManager
import android.net.Uri
import android.os.IBinder
import android.support.v4.app.NotificationCompat
import android.os.CountDownTimer




/**
 * Created by yuuta on 5/21/2018.
 */
class RingtoneService: Service() {
    companion object {
       lateinit var r: Ringtone
    }
    var id:Int = 0
    var isRunning:Boolean = false
    override fun onBind(intent:Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        var state:String = intent!!.getStringExtra("extra")
        assert(state!=null)
        when(state){
            "on" -> id = 1
            "off"->id = 0
        }
        if(!this.isRunning && id == 1){
            playAlarm()
            this.isRunning = true
            this.id = 0
            //fireNotification()
        }
        else if(this.isRunning && id == 0){
            r.stop()
            this.isRunning = false
            this.id = 0
        }
        else if(!this.isRunning && id == 0){
            this.isRunning = false
            this.id = 0
        }
        else if(this.isRunning && id == 1){
            this.isRunning = true
            this.id = 1
        }
        else{

        }
        playAlarm()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun fireNotification() {
        var alarmIntent:Intent = Intent(this, AlarmActivity::class.java)
        var pi:PendingIntent = PendingIntent.getActivity(this, 0, alarmIntent, 0)
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        var notifyManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        var notification: Notification = NotificationCompat.Builder(this, "11")
                .setContentTitle("Sehat Bersama")
                .setContentText("Sudah waktunya olahraga nih! Yuk buka Sehat Bersama!")
                .setTicker("Pengingat Sehat Bersama")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .build()
        notifyManager.notify(11, notification)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.isRunning = false
    }

    private fun playAlarm() {
        var mediaPlayer:MediaPlayer = MediaPlayer()
        var alarmUri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
        if (alarmUri==null) {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        }
        mediaPlayer.setDataSource(this, alarmUri)
        mediaPlayer.prepare()
        mediaPlayer.start()
        val timer = object : CountDownTimer(30000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                // Nothing to do
            }

            override fun onFinish() {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop()
                    mediaPlayer.release()
                }
            }
        }
        timer.start()

    }
}