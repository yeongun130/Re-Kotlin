package com.re_kotlin

// 형변환 함수
/* toByte()
   toShort()
   toInt()
   toLong()
   toDouble()
   toFloat()
   toChar() */

// Kotlin은 암시적 형변환은 지원하지 않으며 명시적 형변환(변환될 자료형을 개발자가 직접 지정)만 지원함.

fun main() {
    // 형변환
    var intValue: Int = 123
    var longValue: Long = intValue.toLong() // Int -> Long

    // 배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5) // null로 채워진 배열 생성 <>안에는 배열에 할당할 자료형 작성

    intArr[2] = 8 // intArr 라는 배열의 2번째 Index 에 8로 지정
    println(intArr[2])
}

/* 배열은 처음 선언했을 때의 전체 크기를 변경 할 수 없다는 단점이 있지만,
   다른 자료구조 보다 빠른 입출이 가능하다는 장점이 있다. */
