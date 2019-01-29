package com.dev.neetsu.gw2checker.Activitys

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.text.method.ScrollingMovementMethod
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.dev.neetsu.gw2checker.R
import enums.GW2_API_V1
import enums.GW2_API_V2
import enums.Properties
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import models.Account

import webAccess.HttpRequest

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    val token = "18DB49E1-BF7C-5345-8C63-3E5CB7FAC342F9B6560C-D84D-4B72-B7A0-6B2A951F3E22"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            var acc = Account()
            acc.initialiseAccount()
            //acc.getAchievements()
            //acc.getBank
            //acc.getDungeons()
            val text: TextView = findViewById(R.id.MainText)
            text.setText(acc.toString())
        }


        //List view
        val list: ListView = findViewById(R.id.List)
        val listItems = arrayOfNulls<String>(GW2_API_V1.values().size + GW2_API_V2.values().size)
        val text: TextView = findViewById(R.id.MainText)
        text.setMovementMethod(ScrollingMovementMethod())

        for (i in 0 until GW2_API_V1.values().size) {
            val element = GW2_API_V1.values()[i]
            listItems[i] = element.value
        }
        for (i in 0 until GW2_API_V2.values().size) {
            val element = GW2_API_V2.values()[i]
            listItems[GW2_API_V1.values().size + i] = element.value
        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        list.adapter = adapter

        list.setOnItemClickListener { _, _, position, _ ->
            val selected = listItems[position]
            var response = HttpRequest().get(token,Properties.APIUrl.value + selected.toString())
            text.setText(response)
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
                var response = HttpRequest().get(token,Properties.APIUrl.value + GW2_API_V1.Build.value)
                val text: TextView = findViewById(R.id.MainText)
                text.setText(response)
            }
            R.id.nav_gallery -> {
                var acc = Account()
                acc.initialiseAccount()
                acc.getAchievements()
                acc.getBank()
                val text: TextView = findViewById(R.id.MainText)
                text.setText(acc.toString())
            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
            R.id.action_settings ->{
                nav_view.inflateMenu(R.menu.activity_main_drawer)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
