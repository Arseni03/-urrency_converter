fun main(args: Array<String>) {
    println("Добрый день!")
    println("Вас приветсвует программа для конвертации валют")
    println("Для начала работы выберите номер валюты, которую вы хотите конвертировать:")
    println("1 - рубли")
    println("2 - доллары")
    println("3 - евро")
    println("// Примечание - при выводе 0 ввод был совершён с ошибкой")
    println()
    val number: String? = readLine()
    println("Выберите номер валюты, в которую вы хотите перевести:")
    val number_operation: String? = readLine()
    println("Теперь введите количество валюты для перевода:")
    val quantity: String? = readLine()
    val result:String = when (number){
        "1" -> getconversion1(number,number_operation,quantity)
        "2" -> getconversion2(number,number_operation,quantity)
        "3" -> getconversion3(number,number_operation,quantity)
        else -> "Данные введены некорректно. Необходимо ввести только цифру"
    }
    println("Поздравляем! Перевод прошёл успешно! Исходная сумма:")
    println(result)
}
fun getconversion1 (number: String?,number_operation: String?,quantity: String?): String {
    if (number == null) return "Ошибка"
    if (number_operation == null) return "Ошибка"
    if (quantity == null) return "Ошибка"
    val conversion: Double = when(number_operation.toInt()){
        2 ->  quantity.toDouble() / 74
        3 ->  quantity.toDouble() / 77.97
        else -> quantity.toDouble() * 0}
    return conversion.toString()
}
fun getconversion2 (number: String?,number_operation: String?,quantity: String?): String {
    if (number == null) return "Ошибка"
    if (number_operation == null) return "Ошибка"
    if (quantity == null) return "Ошибка"
    val conversion: Double = when(number_operation.toInt()){
        1 ->  quantity.toDouble() * 74
        3 ->  quantity.toDouble() * 0.94
        else -> quantity.toDouble() * 0}
    return conversion.toString()
}
fun getconversion3 (number: String?,number_operation: String?,quantity: String?): String {
    if (number == null) return "Ошибка"
    if (number_operation == null) return "Ошибка"
    if (quantity == null) return "Ошибка"
    val conversion: Double = when(number_operation.toInt()){
        1 ->  quantity.toDouble() * 77.97
        2 ->  quantity.toDouble() * 1.05
        else -> quantity.toDouble() * 0}
    return conversion.toString()
}