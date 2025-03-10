object ejercicio2 extends App:

  class CuentaBancaria(saldo: Double):

    def comprobarSaldo: Double =
      saldo

    def depositarDinero(saldoAIngresar: Double): CuentaBancaria =
      CuentaBancaria(saldo + saldoAIngresar)

    def retirarDinero(saldoARetirar: Double): (Double, CuentaBancaria) =
      if saldoARetirar < 0 || saldoARetirar > saldo then
        throw Exception("La cantidad a retirar es invalida o el saldo de la cuenta insuficiente.")
      else (saldoARetirar, CuentaBancaria(saldo - saldoARetirar))

  var cuenta = CuentaBancaria(0)
  printf("El saldo de la cuenta es: %2.2f.\n", cuenta.comprobarSaldo)
  cuenta = cuenta.depositarDinero(10.5)
  printf("El saldo de la cuenta es: %2.2f.\n", cuenta.comprobarSaldo)
  val saldoRetirado = cuenta.retirarDinero(5.5)._1
  cuenta = cuenta.retirarDinero(5.5)._2
  printf("Despues de retirar %2.2f, el saldo de la cuenta es: %2.2f.\n", saldoRetirado, cuenta.comprobarSaldo)
  cuenta.retirarDinero(6)
