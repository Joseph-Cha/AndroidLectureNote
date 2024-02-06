// getter / setter

class Book() {
    var title: String = "모름"
        get() {
            println("getter")
            return "책 제목"
        }
        set(value) {
            println(value)
            field = value // field는 title
        }
}

val book = Book()
//println(book.title) // 책 제목 -> 초기화보다 getter가 더 나중에 호출됨
//book.title = "제목 변경"
//println(book.title) // 제목 변경

class Book2() {
    lateinit var title: String
    fun nextPage() {
        if (::title.isInitialized) {
            println("페이지가 넘어간다")
        } else {
            println("초기화 필요")
        }
    }
}

val book2 = Book2()
book2.title = "책이름"
book2.nextPage()