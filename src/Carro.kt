class Carro : Veiculo {
    override fun detalhesVeiculo(marca: String, cor: String, ano: Int) {
        println("O carro é da $marca e é da cor $cor, fabricado em $ano")
    }

    override fun primeiraMarcha() {
        println("O carro está na primeira marcha")
    }

    override fun segundaMarcha() {
        println("Agora segunda marcha")
    }

    companion object {
        const val DB_FORNECEDORES = "DB_FORNECEDORES"
        const val CLIENTES = "CLIENTES"
    }
}