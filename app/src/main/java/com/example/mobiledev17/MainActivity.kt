package com.example.mobiledev17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mobiledev17.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {
            val intent = Intent(this, CodeblockActivity::class.java)
            startActivity(intent)
        }

        binding.btnQuit.setOnClickListener {
            finish()
        }


    }

}//Log.d("MainActivity","SSSS")