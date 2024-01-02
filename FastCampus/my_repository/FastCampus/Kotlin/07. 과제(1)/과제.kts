//1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않는 경우에는 false가 되는 변수 c를 선언한다.
//단, 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다.
val A = 0
val B = 1
var C: Boolean = false

if (A == B) {
    C = true
}
println(C)

// 풀이
val A: Int = 0
val B: Int = 0
val C: Boolean = if (A == B) true else false

//2. 정수형 변수 A를 선언하고, 변수 B를 선언한다. 이때 변수 B는 A의 2배가 되어야 한다.
var A: Int = 3
var B: Int = A * 2
println(B)

// 풀이와 동일

//3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오(90점 이상 A학점, 80~89점은 B 학점, 70~79점은 C학점, 그렇지 않으면 F)
fun GetCredit(score: Int): Char {
    if (score >= 90) {
        return 'A'
    } else if (score >= 80) {
        return 'B'
    } else if (score >= 70) {
        return 'C'
    } else {
        return 'F'
    }
}
println(GetCredit(90))
println(GetCredit(85))
println(GetCredit(75))
println(GetCredit(55))

// 풀이
fun checkGrade(score: Int): String {
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70 ..79 -> return "C"
        else -> return "F"
    }
}


//4. 학생이 시험에서 맞은 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오(시험 문제는 총 20문제이고 만점은 100점)
fun GetScore(correctCount: Int): Int {
    return correctCount * 5
}

// 풀이
fun gradeTest(correctCount: Int): Int = correctCount * 5 // 1라인 메서드 선언 가능

//5. nullable 정수형 2개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다.
//이때 인수정에 null이 있으면 0으로 취급하여 합을 구한다.

fun myFunction(parm1: Int?, parm2: Int?): Int {
    return parm1!! + parm2!!
}

println(myFunction(5, 0))

// 풀이
fun plusTwoNumber(firstNum: Int?, secontNum: Int?): Int {
    // 함수에서 받은 인자 firstNum, seconNum -> val이다.
    val first: Int = if (firstNum == null) 0 else firstNum
    val second: Int = if (secontNum == null) 0 else secontNum
}