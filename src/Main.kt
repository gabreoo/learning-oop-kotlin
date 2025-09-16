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
}