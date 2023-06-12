package com.teamgrapefruit.re_kotlin

// 클래스 이름은 대문자로 시작하는 파스칼 표기법 ex. ClassName
// 함수나 변수 이름은 소문자로 시작하는 카멜 표기법 ex. functionName

// var, val
// var : 일반적으로 통용되는 변수 언제든지 읽기 쓰기가 가능함
// val : 선언 시에만 값을 초기화 할 수 있음 중간 값을 바꿀 수 없다.

/* runtime 시 바뀌지 말아야 할 값은 안전하게 val로 선언하는 것이 좋다.*/

// 클래스에 선언된 변수 -> Property(속성)
// 이 외에 Scope 내에서 선언 되었을 경우 -> Local Variable

// 초기화 되지 않은 변수에는 null 값을 허용하지 않는다.

/* 값을 할당하지 않은 채로 변수를 사용하게 되면 문법 에러를 표시하고 의도치 않은 컴파일이나
   null pointer exception 등을 원천적으로 차단해준다는 장점이 있다. */

// Kotlin 자료형
// 정수형 -> Byte Short Int Long
// 실수형 -> Float Double
// 문자형 -> Char Boolean

fun main() {
    var a: Int? = null // 자료형 뒤에 ?를 붙이면 nullable 변수로 선언해 줄 수 있다.

    // 정수형
    var intValue = 1234
    var longValue = 1234L // 더 큰 메모리를 사용할 수 있는 정수형임을 표시함.
    var intValueByHex = 0x1af // 0x로 16진수임을 표시
    var intValueByBin = 0b0110 // 0b로 2지진수임을 표시

    // Kotlin은 8진수 표기법을 지원하지 않는다.

    // 실수형
    var doubleValue = 1234.5
    var doubleValueWithExp = 1234.5e10 // 필요 시 지수 표기법 추가 가능
    var floatValue = 1234.5f // float의 경우 뒤에 f,F를 붙여 16bit float 이라는 것을 알려줌.

    var charValue = 'a' // '' 사용
    var booleanValue = true // true 인지 false 인지 직접 선언 해줌.

    val stringValue = "String test" // " " 사용
    val multiLineStringValue = """multiLine
        String
        test""" // 여러 줄의 경우 """ """ 사용
}