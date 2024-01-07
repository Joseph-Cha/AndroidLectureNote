// Range
val range1 = 1..10
val range2 = 1 until 10
println(range1) // 1..10
println(range2) // 1..9

val range3 = 'A'..'Z'
println(range3) // A..Z

// Progression
val range4 = 1..10 step 2
println(range4) // 1, 3, 5, 7, 9

val range5 = 10 downTo 1 step 2
println(range5) // 10, 8, 6, 4, 2

// Step
// - 특징: step의 값과 상관없이 첫번째는 무조건 index 0부터 시작한다.

// Collection
val collection1 = listOf<Int>(1, 2, 3, 4, 5)


