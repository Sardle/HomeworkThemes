package com.example.homeworkthemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        value = intent.getIntExtra("value",0)
        findViewById<TextView>(R.id.value_number).text = value.toString()
    }

    override fun onPause() {
        super.onPause()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("value", value)
    }
}