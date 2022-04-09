package com.seugnjunlee.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 생성자가 없는 클래스 호출
        Kotlin()

        //2. 클래스의 생성자 사용
        KotlinTwo("안녕")

        //3. 클래스의 프로퍼티와 메서드 사용하기
        var kotlin = KotlinThree()
        //메서드를 먼저 출력합니다
        kotlin.printOne()
        //프로퍼티에 값을 넣고 출력합니다
        kotlin.one="Hello"
        kotlin.printOne()

        //4.컴페니언 오브젝트 사용하기 * 첫글자 대문자 주의
        KotlinFour.printOne()
        KotlinFour.one="Hello"
        KotlinFour.printOne()

        //5. 데이터 클래스 사용하기
        var asd = DataUser("Michael",21)
        var newasd= asd.copy()
        newasd.name="Jane"
        Log.d("class","원본 asd는 ${asd.toString()}")
        Log.d("class", "복사된 newasd는 ${newasd.toString()}")
        Log.d("class","원본 asd는 ${asd}")
    }
}

class Kotlin(){ //파라미터가 없는 생성자
    init{
        Log.d("class","Kotlin 클래스 생성됨")
    }
}

class KotlinTwo{ //파라미터가 있는 세컨더리 생성자
    constructor(value: String){
        Log.d("class","KotlinTwo:파라미터 값은 ${value} 입니다.")
    }
}

class KotlinThree{  //프로퍼티와 메서드가 있는 클래스 입니다.
    var one: String = "None"
    fun printOne(){
        Log.d("class","KotlinThree: one에 입력된 값은${one}입니다")
    }
}
class KotlinFour{ // 스태틱 멤버를 갖는 클래스
    companion object{
        var one:String="None"
        fun printOne(){
            Log.d("class","KotlinFour: one에 입력된 값은 ${one} 입니다")
        }
    }
}
data class DataUser(var name: String , var age: Int)//데이터 클래스