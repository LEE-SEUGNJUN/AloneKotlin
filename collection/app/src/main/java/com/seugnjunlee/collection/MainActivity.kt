package com.seugnjunlee.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.값으로 컬렉션 생성하기
        var mutableList = mutableListOf("MON","TUE","WED")
        //값을 추가하기
        mutableList.add("THU")
        //값 꺼내기
        Log.d("Collection","mutableList의 첫번째 값은 ${mutableList.get(0)}")
        Log.d("Collection","mutableList의 전체 값은 ${mutableList}")

        //2. 빈 컬렉션 생성하기
        var stringList = mutableListOf<String>() // 문자열로 된 빈 컬렉션을 생성합니다
        //값을 추가
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        //값 변경
        stringList.set(1,"요일변경")
        //사용
        Log.d("Collection","stringList의 입력된 두번째 값은 ${stringList.get(1)}")
        stringList.removeAt(1)//두번째 값이 삭제됩니다
        Log.d("Collection","stringList의 입력된 두번째 값은 ${stringList.get(1)}")
        //개수 출력
        Log.d("Collection","stringList에는 ${stringList.size} 개의 값이 있습니다")


    }
}