package com.dev.neetsu.gw2checker.Activitys

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AppStart : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, MainActivity::class.java)
                //intent.putExtra("keyIdentifier", value)
                startActivity(intent)
    }
}
