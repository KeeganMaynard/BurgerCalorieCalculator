package com.keegan.android.burgercaloriecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var burger: Burger
    private lateinit var pattyRG : RadioGroup
    private lateinit var prosciuttoCB : CheckBox
    private lateinit var cheeseRG : RadioGroup
    private lateinit var sauceSBR : SeekBar
    private lateinit var caloriesTV : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        burger = Burger()
        initialize()
    }

    private fun initialize(){
        pattyRG = findViewById(R.id.radioGroup1)
        prosciuttoCB = findViewById(R.id.checkBox1)
        cheeseRG = findViewById(R.id.radioGroup2)
        sauceSBR = findViewById(R.id.seekBar1)
        caloriesTV = findViewById(R.id.textView2)

        displayCalories()
    }

    private fun displayCalories(){
        var calorieText = "Calories: " + burger.totalCalories
        caloriesTV.setText(calorieText)
    }
}