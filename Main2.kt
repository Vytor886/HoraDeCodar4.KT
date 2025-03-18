fun main() {
    val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Digite o nome de um planeta:")
    val planetaUsuario = readLine()!!.capitalize()

    if (planetaUsuario in planetas) {
        println("O planeta $planetaUsuario está na lista!")
    } else {
        println("O planeta $planetaUsuario NÃO está na lista.")
    }
}
