// 1. 문자열 직접 전달하는 방법
println("안녕하세요")

// 2. 변수를 출력하는 방법
val name = "이름"
val myName = "홍길동"

println("내 $name 은 $myName 입니다.")

val number1 = 10
val number2 = 100

println("$number1 더하기 $number2 = ${number1 + number2}")

// 3. 특수 문자 출력하는 방법
println("\$a") // \를 사용하는 방법
println("${"myName"}") // ${}를 사용하는 방법 -> myName 문자열 출력ㄹ

println("" + number1 + "더하기" + number2 + "는")

// -> 에러
// 다른 타임 + 문자열과 같은 형태는 에러가 발생
// 따라서 ""을 먼저 붙이고 시작을 해야 한다.
println(10 + "문자열")

