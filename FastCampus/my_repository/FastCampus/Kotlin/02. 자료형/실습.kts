// 변수를 자료형과 함께 선언하는 방법
// -> val/var 변수명 : 타입 = 값
val byteInt: Byte = 10
val shortInt: Short = 10
val integerInt: Int = 10
val longInt: Long = 10

//val wrongByte: Byte = 1000 -> 바이트가 표현할 수 있는 수범위 보다 큰 수를 넣은 경우
//val wrongByte: Byte = "안녕하세요" // 타입 미스 매칭 에러 발생

val floatNumber: Float = 10.0f // float는 값에 타입을 넣어줘야 값의 타입을 넣어줘야 한다.
val doubleNumber: Double = 10.0 // Double의 경우에는 할당하려는 값 뒤에 아무것도 붙이지 않아도 된다. 아마 실수의 기본 타입이 double이기 때문인듯
//val doubleNumber: Double = 10 // 10과 1.0은 같지만 .을 찍어 실수형이라는 것을 표현해야 한다.

// 타입 추런
val number1 = 10   // Int
val number2 = 10.0 // Double

// 논리형
val yes: Boolean = true
val no: Boolean = false

// 문자형
val text1: Char = 'A'
//val text2: Char = 'BB' // error: too many characters in a character literal ''BB''
//val text3: Char = "A" // error: type mismatch: inferred type is String but Char was expected

// 문자열형
val text4: String = "안녕하세요"
val text5: String = "안"
val text5: String = '안' // error: the character literal does not conform to the expected type String

// 팁
// - 타입을 선택할 때는 가장 작은 타입을 선택하는 것이 좋다.
// - 실제로는 대부분 그냥 Int, Double를 사용합니다.

// 변수명
// - 코틀린에서 선점해서 사용하고 있는 키워드는 사용할 수 없다.
