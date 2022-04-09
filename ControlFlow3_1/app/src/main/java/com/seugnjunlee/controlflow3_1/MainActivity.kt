package com.seugnjunlee.controlflow3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eraOfRyu =2.32
        var eraOfDegrom = 2.43

        val era = if (eraOfRyu < eraOfDegrom){
            Log.d("MLB_Result","2019류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        }else{
            Log.d("MLB_Result","2019디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }
        Log.d("MLB_Result","2019 MLB에서 가장 높은 ERA는 ${era}입니다")

        var now = 10

        when (now){
            in 1..3 -> {
                Log.d("when","현재 시간은 1시~3시 사이입니다.")
            }
            4,5,6 -> {
                Log.d("when","현재 시간은 4시또는 5시또는 6시입니다.")
            }
            8 -> {
                Log.d("when","현재 시간은 8시입니다.")
            }
            9 -> {
                Log.d("when","현재 시간은 9시입니다.")
            }
            else -> {
                Log.d("when","else문 : 현재 시간은 ${now}시입니다.")
            }
        }


    }
}