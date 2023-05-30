package com.uaspm1.soundchecker.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.ActivitySplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)

        CoroutineScope(Dispatchers.Main).launch {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            delay(4000L)
            startActivity(intent)
            finish()
        }
    }
}