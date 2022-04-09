package com.seugnjunlee.inheritanceandextension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1.부모 클래스 직접 호출
        var parent = Parent()
        parent.sayHello()
        //2.자식 클래스 호출해서 사용
        var child=Child()
        child.myHello()

        var childclass = ChildClass()
        childclass.opened()
        testStringExtension()
    }

    //String익스텐션 테스트하기
    fun testStringExtension(){
        var original = "Hello"
        var added = "Guys~"

        //plus 함수를 사용해서 문자열을 더할 수 있습니다.
        Log.d("Extension","added를 더한 값은 ${original.plus(added)}입니다.")
    }
}
fun String.plus(word:String):String{
    return this+word
}
//상속 연습
open class Parent(){
    var hello = "안녕하세요."
    fun sayHello(){
        Log.d("Entension","${hello}")
    }
}

class Child : Parent(){
    fun myHello() {
        hello = "Hello"
        sayHello()
    }
}
//메서드 오버라이드 연습
open class BaseClass(){
    open fun opened(){
    }
    fun notOpened(){

    }
}

class ChildClass : BaseClass(){
    override fun opened(){
        Log.d("error","asd")
    }


}

//프로퍼티 오버라이드 연습
open class BaseClass2{
    open var opened: String = "I am"
}
class ChildClass2 : BaseClass2(){
    override var opened:String ="You are"
}
