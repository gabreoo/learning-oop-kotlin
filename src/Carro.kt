class Carro (val marca: String, val cor : String, val ano: Int, val altura : Double) {

    fun detalhesCarro () {
        println("$marca de $cor ano $ano")
    }

    fun ligando() {
        println("Vrummmmmmm")
    }
}