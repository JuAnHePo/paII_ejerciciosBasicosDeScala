object ejercicio2 {
  class cuentaBancaria {
    private var saldo = 0

    def verificarSaldo(): Int = saldo

    def depositarFondos(fondos: Int): Unit = {
      require(fondos > 0, "Cantidad a depositar inválida.\n")
      saldo += fondos
    }

    def retirarFondos(fondos: Int): Unit = {
      require(fondos > 0 && fondos <= saldo, "Cantidad a retirar inválida.\n")
      saldo -= fondos
    }
  }

  @main def mainPruebaCuentaBancaria(): Unit = {
    val cuenta = cuentaBancaria()
    printf("El saldo de la cuenta es: %d€.\n", cuenta.verificarSaldo())
    cuenta.depositarFondos(100)
    printf("El saldo de la cuenta es: %d€.\n", cuenta.verificarSaldo())
    cuenta.retirarFondos(50)
    printf("El saldo de la cuenta es: %d€.\n", cuenta.verificarSaldo())
  }
}
