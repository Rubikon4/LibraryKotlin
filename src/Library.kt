class Library (
    var books: HashMap<String, Book>,
    var users: HashMap<Int, User>
) {
    fun addBook(book: Book) {
        val bookIsbn = book.isbn
        if (books.containsKey(bookIsbn))
            throw Exception("Книга с таким ISBN ($bookIsbn) уже существует!")
        books[bookIsbn] = book
    }

    fun removeBook(isbn: String) {
        books.remove(isbn) ?: throw NoSuchElementException("Такой книги ($isbn) не существует!")
    }

    fun findBook(isbn: String): Book {
        return books[isbn] ?: throw NoSuchElementException("Такой книги ($isbn) не существует!")
    }

    fun getALlBooks() {
        books.values.forEach { book ->
            println("Название/Автор: ${book.title},${book.author}, ISBN: ${book.isbn}.")
        }
    }

    fun addUser(user: User) {
//        val id = user.id
//        users[id] = user
    }

    fun removeUser(user: User) {
        users.remove(user.id)
    }
}