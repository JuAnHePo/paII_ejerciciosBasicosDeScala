object ejercicio4 extends App:

  def imprimirPrimos(valor: Int): Unit =
    val numPrimos = valor
    var primosMostrados = 0
    var i = 2
    while primosMostrados != numPrimos do
      var cnt = 0
      for (j <- 2 to (i / 2))
        if (i % j) == 0 then cnt += 1
      if cnt == 0 then
        printf("%d | ", i)
        primosMostrados += 1
      i += 1

  imprimirPrimos(10)