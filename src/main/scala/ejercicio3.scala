object ejercicio3 extends App:

  class Cadena(cadena: String):

    override def toString: String =
      "<" + cadena + ">"

    def esPalindromo(): Boolean =

      val cadenaMod = cadena.replace(" ", "")
      val pivote = cadenaMod.length / 2
      var substr1 = ""

      if (cadena.length % 2) == 0 then
        substr1 = cadenaMod.substring(0, pivote + 1)
      else
        substr1 = cadenaMod.substring(0, pivote)

      val substr2 = cadenaMod.substring(pivote + 1, cadenaMod.length)
      substr1.equalsIgnoreCase(substr2.reverse)

  val cadena = Cadena("Dabale arroz a la zorra el abad")
  if cadena.esPalindromo() then
    println(cadena.toString + " SI es una palabra/frase palindroma.\n")
  else
    println(cadena.toString + " NO es una palabra/frase palindroma.\n")
