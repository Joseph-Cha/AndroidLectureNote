// 주석 작성하는 방법
// 주석 -> 사람만 보기 위해서 작성

// 1. var 변수 선언하기
var change_yes = 100

// 실습.kts:6:1: error: this property must either have a type annotation, be initialized or be delegated
// // -> 선언과 동시에 초기화
//var change_no
//change_no = 100
println(change_yes)

change_yes = 200

println(change_yes)

// 2. val 변수 선언하기
val change_no = 100
println(change_no)
// 실습.kts:20:1: error: val cannot be reassigned
//change_no = 200

val SCHOOL_NAME = "대한민국 학교"
println(SCHOOL_NAME)