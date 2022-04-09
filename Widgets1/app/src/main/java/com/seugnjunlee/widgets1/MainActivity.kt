package com.seugnjunlee.widgets1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) 

        editText.addTextChangedListener(){
            Log.d("EditText","현재 입력된 값 123 = ${editText.text.toString()}")
            var str1 = editText.text.toString()
            textView.text = str1

        }
        
    }
}