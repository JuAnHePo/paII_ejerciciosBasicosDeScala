object ejercicio5 extends App:

  class mathCommon:

    def mcd(a: Int, b: Int): Int =
      if a == b then a
      else if a == 0 then b
      else if b == 0 then a
      else
        var mayor = 0
        var menor = 0
        if a > b then
          mayor = a
          menor = b
        else
          mayor = b
          menor = a
        if (mayor % menor) != 0 then
          mcd(menor, mayor % menor)
        else
          menor

    def mcm(a: Int, b: Int): Int =
      if a == b then a
      else if a == 0 then b
      else if b == 0 then a
      else
        val math = mathCommon()
        (a * b) / math.mcd(a, b)

  val math = mathCommon()
  val a = 2366
  val b = 273
  val c = 72
  val d = 50
  printf("El MCD de %d y %d es %d.\n", a, b, math.mcd(a, b))
  printf("El MCM de %d y %d es %d.\n", c, d, math.mcm(c, d))