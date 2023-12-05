package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.PopupWindow
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Trade()
    }
    fun Trade(){
        //Get in Portfolio
        val buttonPortfolio: Button =findViewById(R.id.button8)
        buttonPortfolio.setOnClickListener(){
            var i: Intent = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        //Get in notification
        val buttonNotifications: Button =findViewById(R.id.button9)
        buttonNotifications.setOnClickListener(){
            var j: Intent = Intent(this,MainActivity2::class.java)
            startActivity(j)
        }
        val buttonBuy:Button=findViewById(R.id.button4)
        buttonBuy.setOnClickListener(){
            // Inflate the popup window layout
            val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = layoutInflater.inflate(R.layout.popup_window, null)

            // Create the popup window object
            val popupWindow = PopupWindow(
                popupView,
                1000, // width
                700, // height
                true // focusable
            )
            // Show the popup window at the center of the screen
            popupWindow.showAtLocation(buttonBuy, Gravity.CENTER, 0, 0)
            // val text:TextView=popupView.findViewById(R.id.popupBuy)
            val button:Button=popupView.findViewById(R.id.buttonBuy_Sell)
            button.setText("Buy")
        }
        val ButtonSell:Button=findViewById(R.id.button5)
        ButtonSell.setOnClickListener(){
            // Inflate the popup window layout
            val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val popupView = layoutInflater.inflate(R.layout.popup_window, null)

            // Create the popup window object
            val popupWindow = PopupWindow(
                popupView,
                1000, // width
                700, // height
                true // focusable
            )
            // Show the popup window at the center of the screen
            popupWindow.showAtLocation(buttonBuy, Gravity.CENTER, 0, 0)
            // val text:TextView=popupView.findViewById(R.id.popupBuy)
            val button:Button=popupView.findViewById(R.id.buttonBuy_Sell)
            button.setText("Sell")
        }

    }
}