package jp.techacademy.Jongje.Kim.kotlinlog


abstract class Animal {
    // プロパティ
    var name: String
    var age: Int


    // 引数付きコンストラクタ
    constructor(name: String, hobby: String, age: Int) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }

    abstract fun say()
}