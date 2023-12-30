// 산술 연산자
val number1: Int = 1 + 10
val number2: Int = 2 - 10
val number3: Int = 2 * 10
val number4: Int = 40 / 2
val number5: Int = 45 % 7

val number6 = 10 * 427 % 73 + 108 // 할당하려는 값의 타입을 알기 어려운 경우에는 코틀린에게 맡겨도 된다.

// 대입 연산자
var number7: Int = 22
println(number7)
number7 = 100
println(number7)

// 복합 대입 연산자
// A += B -> A = A + B
var number8: Int = 12
number8 += 8
number8 -= 8
number8 *= 2
number8 /= 5

// 증감 연산자(++, --)
var number9:Int = 10
println(number9++) // 10
println(number9)   // 11
println(++number9) // 12


val number10: Int = 1
val number11: Int = 2

val result: Boolean = number10 > number11
println(result)
val result2: Boolean = number10 == number11
println(result2)
val result3: Boolean = number10 != number11
println(result3)

// ===, !== -> 잘 사용하지 않는다.
// 주소가 같은지 물어보는 연산자 (객체의 값을 비교 하는 게 x)
// ==, !=
// 값이 같은지 물어보는 연산

// 논리 연산자
val boolean1: Boolean = true
val boolean2: Boolean = false
val result4: Boolean = boolean1 && boolean2
println(result4)
val result5: Boolean = boolean1 || boolean2
println(result5)




