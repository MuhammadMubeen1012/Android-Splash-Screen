package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    //We have to make this activity an launcher activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //hiding action bar
        supportActionBar?.hide()

        //But we want splash screen for some time, and then remove from the stack
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            //intent to pass from splash screen to main screen
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            //to remove from stack
            finish()
        } , 3000)
    }
}