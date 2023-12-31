// if

val number1: Int = 10

if (number1 == 10) { // 조건식은 무조건 true 또는 false로 결과가 나와야 한다.
    println("10입니다.")
} else if (number1 == 20) {
    println("20입니다.")
} else {
    println("10, 20 둘다 아닙니다.")
}

if (number1 == 10) println("10입니다.")
else if (number1 == 20) println("20입니다.")
else if (number1 == 50) println("50입니다.")
else println("10, 20 둘다 아닙니다.")

val number2: Int = 10 + 20 // 값이 오면 된다 -> 식이 와도 된다
val number3: Int = if (number2 > 30) 40 else 50
println(number3)

// 표현과 식
// 표현
// - 어떤 것을 표현하기 위해서 사용되는 문법적인 요소
// - val, var, Int, Short -> 키워드
// 식
// - 값을 만들어 낸다.
// - 10 + 20
// - if (number2 > 30) 40 else 50 -> 이것도 식으로 코틀린은 판단한다.

// when
val number4: Int = 5
when(number4) {
    5 -> {
        println("5입니다.")
    }
    6 -> {
        println("6입니다.")
    }
    else -> {
        println("무엇도 아닙니다.")
    }
}

when (number4) {
    5 -> println("5입니다.")
    6 -> println("6입니다.")
    else -> println("모르겠습니다.")
}

when (number4) {
    4 -> println("number is 4")
    "안녕하세요" -> println("hello")
    is Boolean -> println("boolean")
}

// boolean을 반환하는 식으로 표현
when (number4) {
    in 1..10 -> println("number is in 1..10")
    in 20..30 -> println("number is in 20..30")
    in 40..60 -> println("number is in 40..60")
}