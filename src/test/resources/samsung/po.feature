@SmokeTestSamsung
@Samsung-03
@Multiplicacion
@SamsungS23
Feature: Multiplicacion de una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder multiplicar un numero con
  # un resultado de incremento

  Scenario: Verificar Multiplicacion Numerica Exitosa
    Given yo quiero operar "7" con el numero "7"
    When realizo la operacion de "multiplication"
    Then finalmente como resultado tendre "49"