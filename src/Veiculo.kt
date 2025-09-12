interface Veiculo {

fun detalhesVeiculo(marca: String, ano: Int) {
    println("Marca: $marca, Ano: $ano")
}
    fun acelerar() {
        println("Acelerando o veículo")
    }

    fun primeiraMarcha() {
        println("Colocando o veículo na primeira marcha")
    }
}