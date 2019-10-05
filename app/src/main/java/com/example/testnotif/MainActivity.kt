package com.example.testnotif

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {
    var builder = NotificationCompat.Builder (this,"test")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,Notif::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }

        val pendingintent: PendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        builder.setSmallIcon(R.drawable.ic_notification)
        builder.setContentTitle("Testing")
        builder.setContentText("Berhasil testing")
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT)
        builder.setContentIntent(pendingintent)
        builder.setAutoCancel(true)
    }
   fun test_notif(view: View){
       with(NotificationManagerCompat.from(this)) {
           // notificationId is a unique int for each notification that you must define
           notify(0, builder.build())
       }
   }
}
