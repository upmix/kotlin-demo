fun main() {
    val height = 1.0 // рост в метрах
    val weight = 88.3 // вес в килограммах
    val index = bodyMassIndex(height, weight) //индекс массы тела


    val verdict = when{ //расшифровка индекса массы тела
        index <= 16 -> "Выраженный дефицит массы тела"
        index <= 18.5 -> "Недостаточная (дефицит) масса тела"
        index <= 25 -> "Норма"
        index <= 30 -> "Избыточная масса тела (предожирение)"
        index <= 35 -> "Ожирение"
        index <= 40 -> "Ожирение резкое"
        index > 40 -> "Очень резкое ожирение"
        else -> "Что-то пошло не так"
    }

    println(verdict)
}

fun bodyMassIndex(height : Double, weight : Double) : Double = weight/height/height