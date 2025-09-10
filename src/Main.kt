//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val corolla = Carro("toyota", "prata", 2020, 1.5)
    println(corolla.marca)
    println(corolla.cor)
    println(corolla.ano)
    println(corolla.altura)

    corolla.detalhesCarro()

    corolla.ligando()

    val p1 = User(18, "Feminino")
    p1.detalhesUser()

//    println("")
}