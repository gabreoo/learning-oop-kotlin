class User (val nome: String, val idade: Int, val sexo: String ) {
    fun detalhesUser () {
        println("Nome: $nome, Idade: $idade, Sexo: $sexo")
    }

    constructor(nome: String, idade: Int) : this(nome, idade, "Não definido")
}