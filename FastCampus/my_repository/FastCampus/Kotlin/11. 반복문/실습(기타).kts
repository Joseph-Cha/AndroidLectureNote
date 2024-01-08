val numbers = intArrayOf(5, 10, 15)

for (number in numbers) {
    println(number)
}

for ((index, value) in numbers.withIndex()) {

}

for (index in numbers.indices) {
    // .indices 인덱스만 필요할 때
}

numbers.forEachIndexed { index, i ->

}

numbers.forEachIndexed { index, value ->

}