val numbers = listOf<Int>(1, 2, 3)
try {
    numbers.get(5)
} catch (exception: Exception) {
    println(exception)
}

try {
    numbers.get(5)
} catch (exception: ArrayIndexOutOfBoundsException) {
    println("예외 발생 A")
}

// 이게 권장 사항
// 작성한 코드에서 어떤 에러가 발생할 수 있는지 알고 발생을 시키는 것이 좋음
try {
    numbers.get(5)
} catch (exception: IllegalArgumentException) { // 여기서는 잡히지 않음
    println("예외 발생 A")
} catch (exception: ArrayIndexOutOfBoundsException) { // 여기서 잡힘
    println("예외 발생 B")
} finally {
    println("마지막!")
}