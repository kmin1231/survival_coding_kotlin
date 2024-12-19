package com.kotlin.kmin1231

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickButton = findViewById<Button>(R.id.clickButton)
        val textView = findViewById<TextView>(R.id.textView)

        clickButton.setOnClickListener{
            textView.text = "You clicked the button!"
        }
    }
}