package com.dev.neetsu.gw2checker.Activitys

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.dev.neetsu.gw2checker.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import java.io.IOException

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val JSON = MediaType.get("application/json; charset=utf-8")
    var client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                val thread = Thread(Runnable {
                    try {
                        get("https://api.guildwars2.com/v2/achievements?ids=1840,910,2258")
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                })

                thread.start()
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun prepareRequest(url: String, token: String, body: RequestBody? = null): Request {

        if (body==null)
        return Request.Builder()
                .url(url)
                .get()
                .addHeader("Authorization", "Bearer "+token)
                .build()
        return Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer "+token)
                .post(body)
                .build()
    }

    operator fun get(url: String) {
        //TODO: Get Token Function
        val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"
        val request = prepareRequest(url, token)

        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                Log.d("HTTP Request", "get: " + resp)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    fun post(url: String, json: String) {
        //TODO: Get Token Function
        val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"

        val body = RequestBody.create(JSON, json)
        val request = prepareRequest(url, token, body)
        try {
            client.newCall(request).execute().use { response ->
                val resp = response.body()!!.string()
                Log.d("HTTP Request", "post: " + resp)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}
