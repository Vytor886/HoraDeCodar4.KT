fun main() {
    val estudantes = mutableListOf<String>()

    while (true) {
        println("Digite o nome do estudante ou 'PARE' para encerrar:")
        val nome = readLine()!!.uppercase()

        if (nome == "PARE") {
            break
        }

        estudantes.add(nome)
    }

    println("\nTotal de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")
    estudantes.forEach { println(it) }
}
