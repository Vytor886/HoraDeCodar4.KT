fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Uva", "Manga")

    while (frutas.isNotEmpty()) {
        println("\nLista de frutas disponíveis: $frutas")
        println("Digite o nome da fruta que deseja remover:")
        val fruta = readLine()!!.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        if (frutas.contains(fruta)) {
            frutas.remove(fruta)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }

    println("Lista de compras finalizada!")
}
