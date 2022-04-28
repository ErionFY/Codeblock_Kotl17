package com.example.mobiledev17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val startButton: Button = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, codeblockActivity::class.java)
            startActivity(intent)
        }


        val quitButton: Button = findViewById(R.id.quitButton)
        quitButton.setOnClickListener {
            this.finish()
        }

    }

}