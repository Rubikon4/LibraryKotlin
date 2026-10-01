class User (
    val name: String,
    val userType: UserType,
) {
    val booksLimit get() = userType.booksLimit
    val borrowTime get() = userType.borrowTime

    companion object {
        private var nextID = 1
    }
    val id: Int = nextID++
    var borrowedBooks: MutableSet<Book> = mutableSetOf()

    fun addBorrowedBook(book: Book) {
        borrowedBooks.add(book)
    }

    fun removeBorrowedBook(book: Book) {
        borrowedBooks.remove(book)
    }
}