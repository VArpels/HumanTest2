package jp.techacademy.Jongje.Kim.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    var hobby: String

    constructor(name: String, hobby: String, age: Int): super(name, hobby, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "年は" + this.age + "歳です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "ついて考える。")
    }
}
