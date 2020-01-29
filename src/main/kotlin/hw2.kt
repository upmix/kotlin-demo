fun main() {
    val height = 1.86 // рост в метрах
    val weight = 88.3 // вес в килограммах
    val index = bodyMassIndex(height, weight) //индекс массы тела


    val verdict = when{ //расшифровка индекса массы тела
        0 < index && index < 15.99 -> "Выраженный дефицит массы тела"
        16 < index && index < 18.49 -> "Недостаточная (дефицит) масса тела"
        18.5 < index && index < 24.99 -> "Норма"
        25 < index && index < 29.99 -> "Избыточная масса тела (предожирение)"
        30 < index && index < 34.99 -> "Ожирение"
        35 < index && index < 39.99 -> "Ожирение резкое"
        index > 40 -> "Очень резкое ожирение"
        else -> "Что-то пошло не так"
    }

    println(verdict)
}

fun bodyMassIndex(height : Double, weight : Double) : Double = weight/height/height