package com.example.hse_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener{
            Log.d("tag", "${Number_1.text}")
            if(Number_1.text.isNotEmpty()){
                var dollars = 74 * Number_1.text.toString().toInt()
                Number_2.setText("$dollars $")
            }
        }
    }


}