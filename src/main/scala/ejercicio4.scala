import scala.collection.mutable.ListBuffer

object ejercicio4 {
  def imprimirNPrimos(n: Int): Unit = {
    def esPrimo(n: Int): Boolean = {
      var cnt = 0
      for (i <- 2 to n / 2)
        if n % i == 0 then cnt += 1
      cnt == 0
    }
    
    var nPrimos = n
    var nActual = 2
    val listNPrimos = new ListBuffer[Int]
    while nPrimos != 0 do
      if esPrimo(nActual) then
        listNPrimos += nActual
        nPrimos -= 1
          
      nActual += 1
    println(listNPrimos)  
  }
  
  @main def mainImprimirNPrimos(): Unit = {
    imprimirNPrimos(10)
  }
}