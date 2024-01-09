loop@for (i in 1..3) {
    println(i)
    for (j in 1..3) {
        if (j == 2) break@loop // i 반복문이 break
        else println(j)
    }
}

loop@for (i in 1..3) {
    println(i)
    for (j in 1..3) {
        if (j == 2) continue@loop // i 반복문이 continue
        else println(j)
    }
}
// i1 -> j1/구문1 -> j1/구문2 -> j2/구문 -> i2

// foreach는 continue와 break 사용 불가
listOf(1,2,3).forEach loop@{
    if (it == 2) return@loop
    else println(it) // 1, 3
}