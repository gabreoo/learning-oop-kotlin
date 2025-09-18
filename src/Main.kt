//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val corolla = Carro()
    corolla.detalhesVeiculo("toyota", "Prata", 2020)

    println(Carro.DB_FORNECEDORES)

    val fornecedoresChassi = Carro.CLIENTES

    val guilherme = User("guilherme", 22)

    val (idade, nome) = guilherme

    println("$idade, $nome") // vai imprimitr guilherme e depois 22 pq ele segue a ordem da classe User


    val joao = Aluno(12345, "João", "Rua A, 123")
    joao.descricao()

    val ramilson = Professor("Ramilson", "Rua B, 456", "Geografia")

    ramilson.descricao()
    println(ramilson.especialidade)


}


class textView (var text: String, var backgroundColor : String) {


    fun render () {
        println("Renderizando o texto $text com a cor de fundo $backgroundColor" )
    }
}

open class Membros (var nome : String, var endereco: String) {

    protected var acessoBiblioteca = false

    fun descricao () {
        println("Membro: $nome, endereço: $endereco acesso a biblioteca: $acessoBiblioteca")
    }


}

class Aluno (var matricula: Int, nome: String, endereco: String) : Membros(nome, endereco) {

    init {
        acessoBiblioteca = false
    }

}

class Professor (nome: String, endereco: String, var especialidade: String) : Membros(nome, endereco) {

    init {
        acessoBiblioteca = true
    }

}
