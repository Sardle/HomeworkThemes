package com.example.homeworkthemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeValue()

        findViewById<TextView>(R.id.increment).setOnClickListener {
            value++
            findViewById<TextView>(R.id.result).text = value.toString()
        }

        findViewById<TextView>(R.id.start_activity).setOnClickListener {
            beginNewActivity()
        }

    }

    private fun initializeValue() {
        value = intent.getIntExtra("value",0)
    }

    private fun beginNewActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("value", value)
        startActivity(intent)
    }
}