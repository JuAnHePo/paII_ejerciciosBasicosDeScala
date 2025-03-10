object ejercicio5 {
  def mcd(a: Int, b: Int): Int = {

    def ordenar(a: Int, b: Int): (Int, Int) = {
      if a > b then (b, a) else (a, b)
    }

    require(a > -1 && b > -1, "Los numeros deben ser positivos.\n")

    val menor = ordenar(a, b)(0)
    val mayor = ordenar(a, b)(1)
    if menor == 0 || mayor == menor then mayor
    else mcd(menor, mayor % menor)
  }

  def mcm(a: Int, b: Int): Int = {
    a * b / mcd(a, b)
  }

  @main def mainMinimosComunes(): Unit = {
    val a = 72
    val b = 50
    val c = 2366
    val d = 273
    println(mcm(72, 50))
    println(mcd(2366, 273))
  }
}