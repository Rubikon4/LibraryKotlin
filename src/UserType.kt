enum class UserType (
    val booksLimit: Int,
    val borrowTime: Int
) {
    STUDENT(3, 14),
    FACULTY(10, 30),
    GUEST(1, 7)
}