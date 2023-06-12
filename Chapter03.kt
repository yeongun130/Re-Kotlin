package com.re_kotlin

// 타입 추론 -> 자료형을 지정 안해줘도 Kotlin 에서 자동으로 자료형을 추론해주는 기능
// 선언 시 값을 할당만 해준다면 자료형을 명시할 필요가 없다.
// 특정한 자료형으로 지정을 하는 상황이 아니라면 대부분 Kotlin의 타입 추론 기능으로 코드량을 줄일 수 있다.

// 함수 -> 특정한 동작을 하거나 원하는 결과 값을 연산하는데 사용
// 변수 -> var, val   함수 -> fun
// 함수는 내부적으로 기능을 가진 형태지만 외부에서 볼 때는 파라미를 넣는다는 점 이외에는 자료형이 결정된 변수라고 접근 하는 것 좋다.

fun main() {
    // 타입 추론
    var intValue = 1234 // 일반 정수형 리터럴 -> Int
    var longValue = 1234L // L, l이 붙은 정수형 리터럴 -> Long

    var doubleValue = 123.45 // 일반 실수형 리터럴 -> Double
    var floatValue = 123.45f // F, f이 붙은 실수형 리터럴 -> Float

    // 2진수, 16진수 -> Int
    var intValueByHx = 0xABCD
    var intValueByBin = 0b0110

    var booleanValue = true // Boolean 으로 추론
    var charValue = 'c' // Char 로 추론

    println(add(2, 4, 5))
    println(plus(2, 4, 5))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일 표현 함수
fun plus(a: Int, b: Int, c: Int) = a + b + c /* -> 변수에 값을 할당하듯 사용
                                                반환형 타입 추론 가능 -> 반환형 생략 가능 */

