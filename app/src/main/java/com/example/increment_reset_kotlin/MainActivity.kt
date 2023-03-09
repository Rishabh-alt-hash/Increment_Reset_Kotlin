package com.example.increment_reset_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 0

        button1.setOnClickListener {

            num++

            textView.text = num.toString()
        }

        button2.setOnClickListener {

            num--

            textView.text = num.toString()

        }

        resetButton.setOnClickListener {

            num = 0

            textView.text = num.toString()

        }
    }
}