object ejercicio1 {
  def esBisiesto(anyo: Int): Boolean = {
    if (anyo % 4 == 0 && anyo % 100 != 0)
      || anyo % 400 == 0 then true else false
  }

  @main def mainBisiesto(): Unit = {
    val anyo = 1800
    if esBisiesto(anyo) then
      printf("%d SI es bisiesto.\n", anyo)
    else
      printf("%d NO es bisiesto.\n", anyo)
  }
}