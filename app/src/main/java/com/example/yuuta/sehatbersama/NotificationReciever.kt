package com.example.yuuta.sehatbersama

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.net.Uri
import android.support.v4.app.NotificationCompat

/**
 * Created by yuuta on 5/21/2018.
 */
public class NotificationReciever : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        var getResult: String = intent.getStringExtra("extra")
        var serviceIntent:Intent= Intent(context, RingtoneService::class.java)
        serviceIntent.putExtra("extra",getResult)
        context.startService(serviceIntent)
//        var alarmUri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
//        if (alarmUri==null) {
//            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
//        }
//        RingtoneService.r = RingtoneManager.getRingtone(context, alarmUri)
//        RingtoneService.r.play()
    }

}