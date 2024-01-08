for (value in 0..3) {
    println("반복문")
}

// range + step
for (value in 0..5 step(2)) {
    println(value)
}

// progression + downTo
for (value in 5 downTo 0) {
    println(value)
}

val numbers = listOf<Int>(5, 6, 7, 8)
for (number in numbers) {
    println(number)
}

for (i in 0 until numbers.size) {
    println(numbers[i])
}

for ((index, number) in numbers.withIndex()) {
    println("" + index + " | " + number) // index와 value를 같이 출력
}

// foreach
numbers.forEach { number ->
    println(number)
}