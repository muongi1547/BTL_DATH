package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        alert()
    }
    fun alert(){
        var autoAlert:Boolean=false
        var customAlert:Boolean=false
        // Click on Auto
        var buttonAuto: Button = findViewById(R.id.button10)
        // CLick on Custom
        var buttonCustom:Button=findViewById(R.id.button13)
        //Click on Submit
        var buttonSubmit:Button=findViewById(R.id.button16)


        buttonAuto.setOnClickListener(){
            if(!autoAlert)buttonAuto.setText("X")
            else buttonAuto.setText("")
            autoAlert=!autoAlert
            if(customAlert){
                customAlert=!customAlert
                buttonCustom.setText("")
            }

        }
        buttonCustom.setOnClickListener(){
            if(!customAlert)buttonCustom.setText("X")
            else buttonCustom.setText("")
            customAlert=!customAlert
            if(autoAlert){
                autoAlert=!autoAlert
                buttonAuto.setText("")
            }
        }

        buttonSubmit.setOnClickListener(){
            if(autoAlert){
                Toast.makeText(this,"You submited Auto Alert",Toast.LENGTH_LONG).show()
            }
            else if (customAlert){
                Toast.makeText(this,"You submited Custom Alert",Toast.LENGTH_LONG).show()
            }
             //ignore if neither of type of Alert has not been clicked
        }
    }
}