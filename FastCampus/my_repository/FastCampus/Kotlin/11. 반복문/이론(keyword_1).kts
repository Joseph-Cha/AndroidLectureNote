// break
for (i in 1..3) {
    println(i)
    for (j in 1..3) {
        if (j == 2) continue
        else println(j)
    }
}

