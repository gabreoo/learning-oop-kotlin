interface Veiculo {
    fun detalhesVeiculo (
        marca: String,
        cor: String,
        ano: Int
    )

    fun primeiraMarcha()
    fun segundaMarcha()

    companion object {
        const val DB_FORNECEDORES = "DB_FORNECEDORES"
        const val CLIENTES = "CLIENTES"
    }
}