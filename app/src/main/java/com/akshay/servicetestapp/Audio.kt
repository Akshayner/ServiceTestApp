package com.akshay.servicetestapp

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Audio:Service()
{
    override fun onBind(p0: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    var player: MediaPlayer? = null

    override fun onCreate() {
        player = MediaPlayer.create(this,R.raw.buzz)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player!!.start()
        player!!.pause()
        return START_STICKY
    }

    override fun onDestroy() {
        player!!.stop()
    }

}