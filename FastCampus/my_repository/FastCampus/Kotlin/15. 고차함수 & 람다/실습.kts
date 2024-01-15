fun addTwoNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}

// 고차함수
fun addTenNine(function: (Int, Int) -> Int) {
    val result: Int = function(10, 9)
    println("결과는 $result 입니다.")
}

addTenNine(::addTwoNumbers) // ::다음에 함수명을 써줘야 한다.

// 람다
// 풀버전(생략이 없는 버전) -> 처음에는 권장
val addTenNine2: (Int, Int) -> Int = { number1: Int, number2: Int ->
    val result = number1 + number2
    // return number1 + number2 // 람다 함수 내부에서 return을 사용할 수가 없다.
    result
    number1 + number2 // 이렇게도 가능
}

addTenNine(addTenNine2) // 람다 함수를 인자로 사용하는 경우에는 ::을 사용할 필요가 없다.

// 생략 버전 1
val addTenNine3: (Int, Int) -> Int = { number1, number2 -> // 함수 타입에서 number1, number2의 타입을 알 수 있기 때문에 타입 생략 가
    val result = number1 + number2
    // return number1 + number2 // 람다 함수 내부에서 return을 사용할 수가 없다.
    result
    number1 + number2 // 이렇게도 가능
}
addTenNine(addTenNine3)

// 생략 버전2
val addTenNine4 = { number1: Int, number2: Int -> // 함수의 타입을 생략할 수 있다(RV를 통해 추론 가능)
    number1 + number2
}

addTenNine(addTenNine4)

// 너무 간단한 경우
addTenNine { number1, number2 -> number1 + number2 } // 인자를 곧바로 함수로 전달할 수가 있다.

// 파라미터가 없는 람다 함수
val addTenNine5: () -> Int = {
    10 + 9
}

// 파라미터가 1개인 경우 it을 사용
val addTenNine6: (Int) -> Int = {
    10 + 9
}

