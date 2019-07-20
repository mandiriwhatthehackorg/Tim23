package com.mandiriexel.apps.ui.splash

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mandiriexel.apps.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            val uri = Uri.parse("mandiri://login")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }, 2000)

    }
}
