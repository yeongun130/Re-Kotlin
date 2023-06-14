package com.re_kotlin

// 반복문
// 1. 조건형 반복문 -> 조건이 참인 경우에 반복 (while, do..while)
// 2. 범위형 반복문 -> 반복 범위를 정해 반복 (for)

// 증감 연산자
// 1. 증가(전위 -> ++a, 후위 -> a++)
// 2. 감소(전위 -> --a, 후위 -> a--)

/* 전위 연산자는 해당 구문에서 값을 바로 값을 증가하거나 감소하지만 후위 연산자는 해당 구문에선 사용하지 않고 다음 구문부터
   한다는 차이점이 있다. */

fun main() {
    var intValue = 0

    // 조건형 반복문
    while (intValue < 5) {
        println(intValue++) // 후위 연산자이므로 0, 1, 2, 3, 4 출력
        println(++intValue) // 전위 연산자이므로 1, 2, 3, 4, 5 출력
    } // 반복 하다가 조건이 거짓이 되면 while문 종료

    // while과 선후관계 차이만 있을 뿐 크게 차이는 없지만 조건과 관계 없이 꼭 한번은 실행 해야 한다면 do..while을 쓰자.
    do {
        println(intValue++)
    } while (intValue < 5)

    // 범위형 반복문
    for (i in 0..9) {
        print(i)
    } // 0부터 9까지 출력

    // step -> for문은 기본적으로 1씩 증가한다. 하지만 step을 이용해서 증가값을 지정해 줄 수 있다.
    for (i in 0..9 step 3) {
        print(i)
    } // 0부터 9까지 3씩 증가하면서 출력

    // downTo -> 증가(X), 감소(O)
    for (i in 9 downTo 0) {
        print(i)
    } // 9부터 0까지 출력
}