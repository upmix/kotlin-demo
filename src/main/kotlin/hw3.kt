import ru.netology.profile.Profile

fun main() {
    val user = Profile(1, "alex", "Alexey", "Ulyanov")
    println(user.fullname)
}