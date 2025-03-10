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

  @main def mainComunes(): Unit = {
    val a = 72
    val b = 50
    val c = 2366
    val d = 273
    printf(s"El minimo comun multiplo de $a y $b es: %d.\n", mcm(a, b))
    printf(s"El maximo comun divisor de $c y $d es: %d.\n", mcd(c, d))
  }
}