package com.aemerse.iapsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        redirectToIntro()
    }

    private fun redirectToIntro() {
        val r = {
            startActivity(Intent(this,GameActivity::class.java))
        }
        val h = Handler()
        h.postDelayed(r, 3000)

    }
}