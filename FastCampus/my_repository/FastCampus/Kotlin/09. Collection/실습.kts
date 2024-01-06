// List
val numbers = listOf<Int>(1, 2, 3)
//numbers[0] = 3 // 실습.kts:4:8: error: no set method providing array access
numbers2[0] = 3
numbers.get(1)
numbers.indexOf(2) // 1
numbers.last()  // 3
numbers.first() // 1

val numbers2 = mutableListOf<Int>(1, 2, 3)
numbers2.add(50) // mutable이라 변경 가능
numbers2.removeAt(0) // 첫번째 값 삭제
numbers2.addAll(2, listOf<Int>(100, 100)) // index부터 list값을 추가

// Set
val numbers3 = setOf<Int>(1, 2, 3, 4, 1, 1, 1)
println(numbers3.contains(1)) // true
numbers3.containsAll(setOf<Int>(1, 3)) // true
var numbers4 = mutableSetOf<Int>(1, 2, 3, 1, 1)
numbers4.remove(1)
println(numbers4)
println(numbers3) // 1, 2, 3, 4

// Map
val numbers5 = mapOf<Int, String>(1 to "One", 2 to "Two")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1)) // "One"
println(numbers5[2]) // "Two"
println(numbers5.getOrDefault(1, "default")) // 없으면 default 값이 나옴
println(numbers5.get(3))
val numbers6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two")) // pair를 활용하여 초기화

