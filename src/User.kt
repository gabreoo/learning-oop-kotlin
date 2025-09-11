class User (val nome: String, val idade: Int, val sexo: String ) {
    fun detalhesUser () {
        println("Nome: $nome, Idade: $idade, Sexo: $sexo")
    }

    constructor(nome: String, idade: Int) : this(nome, idade, "Não definido"){
        println("2")
    }

    constructor(idade: Int) : this("Não definido", idade, "Não definido"){
        println("3")
    }

    constructor(idade: Int, sexo: String) : this("Não definido", idade, "Não definido"){
        println("3")
    }

    fun objetoCriado () {
        println("Objeto criado")
    }
    init {
     objetoCriado()
    }
}