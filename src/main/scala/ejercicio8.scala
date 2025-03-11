object ejercicio8 {
  def rotarLista(l: List[Int], n: Int): List[Int] = {
    if l.isEmpty then l
    else
      val nRotaciones = l.length - n
      val listaPartida = l.splitAt(nRotaciones)
      val newList = listaPartida(1) ::: listaPartida(0) 
      newList
  }

  @main def mainRotarLista(): Unit = {
    val l = List(1,2,3,4,5)
    println(rotarLista(l, 2))
  }
}
