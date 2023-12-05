package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        portfolio()
    }
    fun portfolio(){
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val items = mutableListOf<Any>()
        items.add(SectionTitle("Trading List"))
        items.add(SectionItem1("ACB","22.7","-0.20","100"))
        items.add(SectionItem1("BCM","61.4","0.0","200"))
        items.add(SectionItem1("BID","42.9","0.25","300"))
        items.add(SectionItem1("BVH","40.8","-0.05","100"))
        items.add(SectionItem1("CTG","29.7","-0.15","500"))
        items.add(SectionItem1("FPT","91.0","-0.3","100"))
        items.add(SectionTitle("Total Assests"))
        items.add(SectionItem2("1","1","1"))
        items.add(SectionTitle("Stock Market History"))
        items.add(SectionItem3("13/11/2003","ACB","BUY","100","2000"))

        // Add more items with different types for additional sections

        val adapter = SectionAdapter(items)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        //Get in the notifications
        val buttonNotification:Button=findViewById(R.id.button2)//Get in the notifications
        buttonNotification.setOnClickListener(){
            Toast.makeText(this,"You clicked on Notification!",Toast.LENGTH_LONG).show()
            var i: Intent = Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
        //Get in the Trade
        val buttonTrade:Button=findViewById(R.id.button6)
        buttonTrade.setOnClickListener(){
            var j: Intent = Intent(this,MainActivity3::class.java)
            startActivity(j)
        }
    }
}
