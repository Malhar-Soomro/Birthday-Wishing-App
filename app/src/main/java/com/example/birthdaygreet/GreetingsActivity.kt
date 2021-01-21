package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_greetings.*

class GreetingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
        greetingstxt.text = "Happy Birthday\n$name!"
    }
}