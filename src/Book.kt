class Book (
    val title: String,
    val author: String,
    val isbn: String,
    var isAvailable: Boolean,
) {
    companion object {
        private var NextID: Int = 1
    }
    val id: Int = NextID++

    fun changeAvailable() {
        if (isAvailable) {
            isAvailable = false
        }
        isAvailable = true
    }
}