object ejercicio1 extends App:

  class Anyo(valor: Int):

    def obtenerValor: Int =
      valor

    def esBisiesto(): Boolean =
    if (valor % 4 == 0 && valor % 100 != 0)
      || valor % 400 == 0  then true else false

  val anyo = Anyo(1900)
  if anyo.esBisiesto() then
    printf("%d SI es bisiesto.", anyo.obtenerValor)
  else
    printf("%d NO es bisiesto.", anyo.obtenerValor)