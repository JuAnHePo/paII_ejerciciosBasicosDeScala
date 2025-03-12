object ejercicio9 {
  def combinarArraysOrdenados(a: Array[Int], b: Array[Int]): Array[Int] = {
    val arrayFinal = new Array[Int](a.length + b.length)
    var index = 0
    var indexA = 0
    var indexB = 0

    while index != arrayFinal.length do
      if indexA != a.length && indexB != b.length then
        if a(indexA) <= b(indexB) then
          arrayFinal(index) = a(indexA)
          indexA += 1
        else
          arrayFinal(index) = b(indexB)
          indexB += 1
        index += 1
      else
        if indexA != a.length then
          for (i <- indexA until a.length)
            arrayFinal(index) = a(i)
            index += 1
        else if indexB != b.length then
          for (i <- indexB until b.length)
            arrayFinal(index) = b(i)
            index += 1
    arrayFinal
  }
  
  @main def mainCombinarArraysOrdenados(): Unit = {
    val a = Array(1, 3, 5, 7)
    val b = Array(2, 4, 6, 7, 8)
    println(combinarArraysOrdenados(a, b).mkString(" | "))
  }
}
