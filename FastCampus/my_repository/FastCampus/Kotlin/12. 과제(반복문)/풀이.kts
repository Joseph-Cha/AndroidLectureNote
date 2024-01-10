// 1번
fun printString(string: String, n: Int) {
    for (i in 0 until  10) {
        println(string)
    }
}

printString("name", 10)

// 2번
fun sumNumber(n: Int): Int {
    var sum = 0
    for (i in 1 .. n) {
        sum = sum + i
    }
    return sum
}

println(sumNumber(10))

// 3번
fun sumNumber(): Int {
    var sum = 0
    for (i in 1 .. 100) {
        if (i % 7 == 0) {
            sum += i
        }
    }

    return sum
}

println(sumNumber())

// 4번
fun test4(number: Int) {
    if (number >= 100) {
        return
    }
    var n = number
    while (n < 100) {
        n++
    }
}

// 5번
fun test5() {
    val scores = listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
    val result = BooleanArray(10)

    for (i in 0 until 10) {
        if (scores[i] >= 80) {
            result[i] = true
        }
        else {
            result[i] = false
        }
    }

    for (i in 0 until result.size) {
        println(result[i])
    }
}

test5()