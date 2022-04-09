package com.seugnjunlee.constraintchain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            Toast.makeText(applicationContext,"btn1을 눌렀습니다",Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener(){
            Toast.makeText(this,"aaㅁㅂㅈㅂ",Toast.LENGTH_SHORT).show()
        }
    }
}