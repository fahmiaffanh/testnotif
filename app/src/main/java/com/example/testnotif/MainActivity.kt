package com.example.testnotif

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

        builder.setSmallIcon(R.drawable.ic_notification)
        builder.setContentTitle("Testing")
        builder.setContentText("Berhasil testing")
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }
   fun test_notif(view: View){
       with(NotificationManagerCompat.from(this)) {
           // notificationId is a unique int for each notification that you must define
           notify(0, builder.build())
       }
   }
}
