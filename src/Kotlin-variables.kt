fun main() {

    // Quantidade de alunos em cada sala

    var room1 = 13
    var room2 = 14
    var room3 = 15

    // Soma a quantidade de alunos das três salas
    var total = room1 + room2 + room3

    // Exibe o total de alunos no console
    println(total)



    // Comentários de uma linha
    /*
     Comentário de bloco
     pipipipi
     popopopo
     */


    // Atualizando a quantidade de alunos das salas
    room1 = 16
    room2 = 17
    room3 = 18

    // Calculando novamente o total de alunos
    total = room1 + room2 + room3

    // Mostra o novo total no console
    println(total)

    // ==========================
    // Variáveis e Constantes
    // ==========================

    // Variáveis para armazenar nome e sobrenome
    var firstName = "Jonas"
    var lastName = "Souza"

    // Exibe o nome e o sobrenome
    println(firstName)
    println(lastName)

    // Constantes (valores que não podem ser alterados)
    val pi = 3.141592
    val gravity = 9.81

    // Variável criada com inferência de tipo
    // O Kotlin entende automaticamente que é um Int
    var value1 = 500

    // Variável criada com declaração explícita do tipo Int
    var value2: Int = 500

    // Exibe o valor da variável value1
    println(value1)

    // Exibe o valor da variável value2
    println(value2)

    // Exibe as constantes
    println(pi)
    println(gravity)
}