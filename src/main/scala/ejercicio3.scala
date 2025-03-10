object ejercicio3 {
    def esPalindromo(cad: String): Boolean = {
      val newCad = cad.replace(" ", "")
      if newCad.length % 2 == 0 then
        val subStr1 = newCad.substring(0, newCad.length / 2)
        val subStr2 = newCad.substring(newCad.length / 2, newCad.length)
        subStr1.equalsIgnoreCase(subStr2.reverse)
      else
        val piv = newCad.length / 2
        val subStr1 = newCad.substring(0, piv)
        val subStr2 = newCad.substring(piv + 1, newCad.length)
        subStr1.equalsIgnoreCase(subStr2.reverse)
    }

    @main def mainPalindromo(): Unit = {
      val cad = "dabale arroz a la zorra el abad"
      if (esPalindromo(cad)) then
        println(s"<$cad> SI es palindromo.\n")
      else
        println(s"<$cad> NO es palindromo.\n")
    }
}