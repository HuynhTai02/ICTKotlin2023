//Mutable Collections là tập các lớp dùng để lưu trữ danh sách dữ liệu và có thể thay đổi kích thước được
//Immutable Collections là tập các lớp dùng để lưu trữ danh sách dữ liệu và không thể thay đổi kích thước được
fun exImmutable() {
    //Immutable
    val ds = listOf(1, 2, 3, 4)
    println(ds)
}

fun exMutable() {
    //Mutable
    var numbers = mutableListOf(5, 6, 1, 0, 4)

    // In danh sách ra màn hình
    println("Initial Numbers: $numbers")

    // Thêm phần tử vào danh sách
    numbers.add(6)
    numbers.add(7)

    // In danh sách sau khi thêm phần tử
    println("Numbers after adding: $numbers")

    // Sửa giá trị của phần tử trong danh sách
    numbers[0] = 10
    numbers[2] = 30

    // In danh sách sau khi sửa giá trị
    println("Numbers after updating: $numbers")

    // Xoá phần tử khỏi danh sách
    numbers.removeAt(1)
    numbers.remove(5)

    // In danh sách sau khi xoá phần tử
    println("Numbers after removing: $numbers")
}

fun countWordOccurrences() {
    print("\nInput Text: ")
    val inputText = readlnOrNull() ?: ""
    val wordCountMap = mutableMapOf<String, Int>()

    // Xử lý và đếm số lần xuất hiện của từ trong đoạn văn bản
    inputText.split(Regex("\\s+"))
        .forEach { word ->
            val normalizedWord = word.trim().removeSuffix(",") // Loại bỏ dấu phẩy từ các từ
            val count = wordCountMap[normalizedWord] ?: 0
            wordCountMap[normalizedWord] = count + 1
        }

    // Chuyển mutable map thành immutable map để trả về kết quả
    val result = wordCountMap.toMap()

    println(result)
}