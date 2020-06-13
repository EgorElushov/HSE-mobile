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
            if(Number_1.text.isNotEmpty()){
                if(spinner.getSelectedItemPosition() == 0){
                    var dollars = 74 * Number_1.text.toString().toDouble()
                    Number_2.setText("$dollars $")
                }
                else {
                    var rubles =  Number_1.text.toString().toDouble() / 74
                    Number_2.setText("$rubles ₽")
                }
            }
        }
    }


}