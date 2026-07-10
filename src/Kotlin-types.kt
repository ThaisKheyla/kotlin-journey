fun main() {

    // Tipos numéricos inteiros

    // Mostra o maior valor que um Int suporta
    println(Int.MAX_VALUE)
    // Mostra o menor valor que um Int suporta
    println(Int.MIN_VALUE)


    // Números com casas decimais

    // Double é o tipo padrão para números decimais
    var saldo = 2000.67

    // Definindo Double de forma explícita
    var salario: Double = 1416.67

    // Para usar Float, é necessário adicionar F no final
    var altura = 1.55f
    var temperatura: Float = 67.0F

    // Exibindo os valores
    println(saldo)
    println(salario)
    println(altura)
    println(temperatura)

    // Texto e caracteres

    var modulo: String = "Introdução ao Kotlin"
    var nomeEscola = "Esipetequi"

    // Aqui será considerado String
    var letra = "K"

    // Para um único caractere, usamos Char
    var genero: Char = 'F'

    // Exibindo os valores
    println(modulo)
    println(nomeEscola)
    println(letra)

    // Exibindo um Char
    println("$genero")

    // Boolean (verdadeiro ou falso)

    var aprovado = true
    var primeiraVez: Boolean = false

    // Pair (par de valores)

    val (endereco, numero) = Pair("Rua Haddock Lobo", 6767)

    println(endereco)
    println(numero)

    // Null Safety

    // O ? permite que a variável receba null
    var carteiraMotorista: String? = null

    if (carteiraMotorista != null) {
        println("A carteira de motorista é $carteiraMotorista")
    } else {
        println("Esta pessoa não possui carteira de motorista")
    }
}
