object ejercicio6 {
  def buscarSegundoMayor(l: List[Int]): Int = {

    def buscarMayor(l: List[Int]): Int = {
      var mayor = l.head
      for (i <- l.indices)
        if mayor < l(i) then mayor = l(i)
      mayor
    }

    val mayor = buscarMayor(l)
    var segundoMayor = l.head
    for (i <- l.indices)
      if l(i) != mayor
        && segundoMayor < l(i) then segundoMayor = l(i)
    segundoMayor
  }

  @main def mainBuscarSegundoMayor(): Unit = {
    val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    printf(s"El segundo mayor valor de la lista $list es %d", buscarSegundoMayor(list))
  }
}
