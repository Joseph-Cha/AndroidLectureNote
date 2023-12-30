val number: Int? = null // null이 들어갈 수 있는 변수 -> Nullable
//val number2: Int = null // error: null can not be a value of a non-null type Int

val num1: Int = 2 + 5
val num2: Int = 10
val num3: Int = num1 + num2 // 17

val number2: Int? = 2 + 5
val number3: Int? = 10

//val number4: Int? = number2 + number3 // error: operator call corresponds to a dot-qualified call 'number2.plus(number3)' which is not allowed on a nullable receiver 'number2'.
val number4: Int? = number2!! + number3!! // !!는 null이 아니라는 보장

// !!로 Null이 아님을 개발자가 보장 할 수 있다.
// 하지만 실제로 Null인 경우 NPE(NullPointException이 발생할 수 있다)
// -> 결론: 정말 100% 확신이 있는 경우가 아니면 사용하지 말자!!

if (null == 5) { // == 비교 연산은 가능함
    println("same")
} else {
    println("not same")
}

if (null == null) { // == 비교 연산은 가능하다
    println("same")
} else {
    println("not same")
}