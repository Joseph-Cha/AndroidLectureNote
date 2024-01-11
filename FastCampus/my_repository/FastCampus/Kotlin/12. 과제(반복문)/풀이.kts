// 1번
fun printString(string: String, n: Int) {
    for (i in 0 until  n) {
        println(string)
    }
}

printString("name", 10)

// 2번
fun sumNumber(n: Int): Int {
    var sum = 0
    for (i in 1 .. n) {
        sum = sum + i
    return sum
}

println(sumNumber(10))

// 답안
fun sumUntil(givenNumber: Int): Int {
    var sum: Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
    // 0부터 10 까지 값의 합
    // 0부터 10 까지 인덱스의 합
}


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

// 답안
fun sum7s(): Int {
    var sum: Int = 0
    for (i in 0..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}

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

// 답안
fun increaseOne(numberUnder100: Int) {
    var givenNumber: Int = numberUnder100
    while (givenNumber < 100) {
        givenNumber++
        println("up")
    }
    return
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

// 답안
fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
//        else resultArray[index] = false
    }
    return resultArray
}

//val result = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
//result.forEach {
//    println(it)
//}

// 6번
fun printDiceGame() {
    var result = mutableListOf<List<Int>>();
    for (i in 0 until 6) {
        for (j in 0 until 6) {
            if (i + j == 6) {
                result.add(listOf(i, j))
            }
        }
    }

    for (i in 0 until result.size) {
        println(result[i])
    }
}

printDiceGame()

// 답안
fun findSumIsSixFromDice(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 6) resultList.add(listOf<Int>(i, j))
        }
    }
    return resultList
}
//println(findSumIsSixFromDice())

// 7번
fun howManyEatToFull(totalEat: Int, CurrentEatCount: Int) {
    var needEatCount = totalEat - CurrentEatCount
    if (needEatCount == 0) {
        return
    }

    for (i in 0 until needEatCount) {
        println("밥을 먹었다")
        needEatCount++
        if (needEatCount == totalEat) {
            break
        }
    }

    println("배가 부르다")
}

howManyEatToFull(4, 2)

// 답안
fun eatUntilNothugry(totalCount: Int, currentCount: Int) {
    var currentCountCopy: Int = currentCount
    do {
        println("밥을 먹었다")
        currentCountCopy++
    } while (currentCountCopy < totalCount)
    println("배가 부르다")
}

// 8번
fun mergeTwoGroup(group1: MutableList<String>, group2: MutableList<String>, removedNumber: Int)
        : List<List<String>>? {
    if (group1.size <= removedNumber || group2.size <= removedNumber) {
        return null
    }

    group1.removeAt(removedNumber)
    group2.removeAt(removedNumber)

    val newGroup = mutableListOf<MutableList<String>>()
    newGroup.add(group1)
    newGroup.add(group2)

    return newGroup
}

val group1 = mutableListOf<String>("A", "B", "C", "D", "E")
val group2 = mutableListOf<String>("A", "B", "C")
val result = mergeTwoGroup(group1,  group2, 2)

println(result)

// 답안
//eatUntilNothugry(10, 11)
fun killNthArmy(
    firstArmy: List<String>,
    secondArmy: List<String>,
    killNth: Int
): List<List<String>>? {
    if (firstArmy.size < killNth || secondArmy.size < killNth) return null
    val firstArmyTemp = mutableListOf<String>()
    val secondArmyTemp = mutableListOf<String>()
    for ((index, army) in firstArmy.withIndex()) {
        if (index != killNth) firstArmyTemp.add(army)
    }
    for ((index, army) in secondArmy.withIndex()) {
        if (index != killNth) secondArmyTemp.add(army)
    }
    val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
    return result
}


// 9번
fun printMultiplicationTables(number: Int) {
    var result = mutableListOf<Int>()
    for (i in 1 .. 9) {
        result.add(number * i)
    }

    println(result)
}

printMultiplicationTables(3)

// 답안
fun gugudan(dan: Int) {
    val numbers = mutableListOf<Int>()
    for (i in 1..9) numbers.add(dan * i)
    println(numbers)
}
    gugudan(8)

// 10번
fun makeMap(list1: List<Int>, list2: List<Int>): Map<String, Int>{
    var result = mutableMapOf<String, Int>()

    for (value in list1) {
        if (value % 2 == 0) {
            result.put("짝수", value)
        }
        else {
            result.put("훌수", value)
        }
    }

    for (value in list2) {
        if (value % 2 == 0) {
            result.put("짝수", value)
        }
        else {
            result.put("홀수", value)
        }
    }
    return result
}

// 답안
fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}

println(
    splitNumbers(listOf<Int>(1, 2, 3, 4, 5), listOf<Int>(6, 7, 8, 9, 10))
)