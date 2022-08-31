package jp.techacademy.Jongje.Kim.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Myhuman = Human("Jongje Kim", "DIY",40)      // 名前をJongje Kim、年40歳で、Myhumanのインスタンスを作る


        Myhuman.say()

        Myhuman.think()

    }


}