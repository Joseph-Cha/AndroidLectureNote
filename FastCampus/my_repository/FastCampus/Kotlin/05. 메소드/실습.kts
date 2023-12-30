var number100: Int = 100


// 함수를 선안하는 방법
fun plusNumbers(firstNum: Int, secondNum: Int): Int {
    val result: Int = firstNum + secondNum
    return result
}

plusNumbers(firstNum = 10, secondNum = 20) // -> 30
plusNumbers(10, 20) // -> 30

val result: Int = plusNumbers(firstNum = 5, secondNum = 7) // 12

// 기본 값이 있는 함수
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}

val result2: Int = plusNumbersWithDefault(firstNum = 10) // 20
val result3: Int = plusNumbersWithDefault(firstNum = 10, secondNum = 20) // 30

fun plusNumberWithNoReturn(firstNum:Int, secondNum: Int): Unit {
    val result: Int = firstNum + secondNum
    println(result)
}

fun plusNumberWithNoReturn(firstNum:Int, secondNum: Int) {
    val result: Int = firstNum + secondNum
    println(result)
}
plusNumberWithNoReturn(100, 200)

// 함수 선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val result10: Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(result10)

// 가변 인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    println(numbers) // numbers 주소 값 출력
    for (number in numbers) {
        println(number)
    }
}

plusMultipleNumbers(1, 2, 3, 4, 5)

number100 = 200
