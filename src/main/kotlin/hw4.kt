import ru.netology.hierarchy.Button
import ru.netology.hierarchy.TextView
import ru.netology.hierarchy.View
import ru.netology.hierarchy.ViewGroup

fun main() {
    val view = View()
    view.click()
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text)
    text.text = "Something bad happened"
    println(text.text) // Something bad happened*/


    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me


    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}