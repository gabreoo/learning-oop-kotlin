class Encordoamento (val numeroDeCordas: Int, val marca : String)


open class Instrumento (var cor: String) {

    fun console() {
        println("Esse instrumento é da cor $cor")
    }

}

class Guitar (cor: String) : Instrumento (cor){

}