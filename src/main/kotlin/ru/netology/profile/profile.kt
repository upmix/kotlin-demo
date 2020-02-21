package ru.netology.profile

open class Profile(
    val id: Int,
    val login: String,
    private val name: String,
    private val surname: String,
    var status: String? = null,
    var avatar: String? = null

) {
    val fullname = "$name $surname"
}