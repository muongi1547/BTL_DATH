package com.example.test

import android.app.Notification
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Notification()
    }
fun Notification(){

    val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
    val items = mutableListOf<Any>()
    items.add(SectionNotifications("BUY","ACB","200","35000"))
    items.add(SectionNotifications("SELL","ACB","200","40000"))
    items.add(SectionNotifications("BUY","FLC","10000","8000"))
    items.add(SectionNotifications("ALERT","FLC"))
    items.add(SectionNotifications("BUY","ACB","200","35000"))
    items.add(SectionNotifications("SELL","ACB","200","40000"))
    items.add(SectionNotifications("BUY","FLC","10000","8000"))
    items.add(SectionNotifications("ALERT","FLC"))
    items.add(SectionNotifications("BUY","ACB","200","35000"))
    items.add(SectionNotifications("SELL","ACB","200","40000"))
    items.add(SectionNotifications("BUY","FLC","10000","8000"))
    items.add(SectionNotifications("ALERT","FLC"))
    items.add(SectionNotifications("BUY","ACB","200","35000"))
    items.add(SectionNotifications("SELL","ACB","200","40000"))
    items.add(SectionNotifications("BUY","FLC","10000","8000"))
    items.add(SectionNotifications("ALERT","FLC"))


    // Add more items with different types for additional sections
    val adapter = SectionNotificationAdapter(items)
    recyclerView.adapter = adapter
    recyclerView.layoutManager = LinearLayoutManager(this)
    //Get in the Portfolio
    val buttonPortfolio:Button=findViewById(R.id.button3)
    buttonPortfolio.setOnClickListener(){
        var i: Intent = Intent(this,MainActivity::class.java)
        startActivity(i)
    }

    val buttonTrade:Button=findViewById(R.id.button7)
    buttonTrade.setOnClickListener(){
        var j: Intent = Intent(this,MainActivity3::class.java)
        startActivity(j)
    }
}
}