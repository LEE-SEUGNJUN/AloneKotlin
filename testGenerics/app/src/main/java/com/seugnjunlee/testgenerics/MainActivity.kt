package com.seugnjunlee.testgenerics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testGenerics()

    }
}

fun testGenerics(){
    //String을 제네릭("<>")으로 사용 했기때문에 list변수에는 문자열만 담을 수 있다
    var list: MutableList<String> = mutableListOf()
    list.add("월")
    list.add("화")
    list.add("수")
    //list.add(35) // <-입력 오류가 발생합니다.
    //String 타입의 item 변수로 꺼내서 사용할 수 있습니다.
    for(item in list){
        Log.d("Generic","list에 입력된 값은 ${item}입니다.")
    }
}
