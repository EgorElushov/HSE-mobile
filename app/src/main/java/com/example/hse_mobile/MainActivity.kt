package com.example.hse_mobile

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

/*
0 - Рубли
1 - Доллары
2 - Евро
3 - Фунты
4 - Гривны
5 - Китайские юани
 */

var rubles_to_dollars: Double = 1.0 / 74
var rubles_to_euro: Double = 0.013
var rubles_to_pounds: Double = 0.011
var rubles_to_hryvnia: Double = 0.38
var rubles_to_yuan: Double = 0.1
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener {
            if (Number_1.text.isNotEmpty()) {
                when (spinner.selectedItemPosition) {
                    0 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble()
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = rubles_to_dollars * Number_1.text.toString().toDouble()
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = rubles_to_euro * Number_1.text.toString().toDouble()
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = rubles_to_pounds * Number_1.text.toString().toDouble()
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = rubles_to_hryvnia * Number_1.text.toString().toDouble()
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = rubles_to_yuan * Number_1.text.toString().toDouble()
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                    1 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble() / rubles_to_dollars
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = Number_1.text.toString().toDouble()
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = rubles_to_euro * Number_1.text.toString().toDouble() / rubles_to_dollars
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = rubles_to_pounds * Number_1.text.toString().toDouble() / rubles_to_dollars
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = rubles_to_hryvnia * Number_1.text.toString().toDouble() / rubles_to_dollars
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = rubles_to_yuan * Number_1.text.toString().toDouble() / rubles_to_dollars
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                    2 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble() / rubles_to_euro
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = rubles_to_dollars * Number_1.text.toString().toDouble() / rubles_to_euro
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = Number_1.text.toString().toDouble()
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = rubles_to_pounds * Number_1.text.toString().toDouble() / rubles_to_euro
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = rubles_to_hryvnia * Number_1.text.toString().toDouble() / rubles_to_euro
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = rubles_to_yuan * Number_1.text.toString().toDouble() / rubles_to_euro
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                    3 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble() / rubles_to_pounds
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = rubles_to_dollars * Number_1.text.toString().toDouble() / rubles_to_pounds
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = rubles_to_euro * Number_1.text.toString().toDouble() / rubles_to_pounds
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = Number_1.text.toString().toDouble()
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = rubles_to_hryvnia * Number_1.text.toString().toDouble() / rubles_to_pounds
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = rubles_to_yuan * Number_1.text.toString().toDouble() / rubles_to_pounds
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                    4 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble() / rubles_to_hryvnia
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = rubles_to_dollars * Number_1.text.toString().toDouble() / rubles_to_hryvnia
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = rubles_to_euro * Number_1.text.toString().toDouble() / rubles_to_hryvnia
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = rubles_to_pounds * Number_1.text.toString().toDouble() / rubles_to_hryvnia
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = Number_1.text.toString().toDouble()
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = rubles_to_yuan * Number_1.text.toString().toDouble() / rubles_to_hryvnia
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                    5 -> {
                        when (spinner2.selectedItemPosition) {
                            0 -> {
                                val rubles = Number_1.text.toString().toDouble() / rubles_to_yuan
                                Number_2.setText("$rubles ₽")
                            }
                            1 -> {
                                val dollars = rubles_to_dollars * Number_1.text.toString().toDouble() / rubles_to_yuan
                                Number_2.setText("$dollars $")
                            }
                            2 -> {
                                val euro = rubles_to_euro * Number_1.text.toString().toDouble() / rubles_to_yuan
                                Number_2.setText("$euro €")
                            }
                            3 -> {
                                val pounds = rubles_to_pounds * Number_1.text.toString().toDouble() / rubles_to_yuan
                                Number_2.setText("$pounds £")
                            }
                            4 -> {
                                val hryvnia = rubles_to_hryvnia * Number_1.text.toString().toDouble() / rubles_to_yuan
                                Number_2.setText("$hryvnia ₴")
                            }
                            5 -> {
                                val yuan = Number_1.text.toString().toDouble()
                                Number_2.setText("$yuan ¥")
                            }
                        }
                    }
                }
            }
        }
    }
}