package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent= this.intent
        textViewSkorP1.text = intent.getStringExtra("skorplayer1")
        textViewSkorP2.text = intent.getStringExtra("skorplayer2")


    }
}
