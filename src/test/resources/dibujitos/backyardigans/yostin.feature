@SmokeTest
@COM-2237
@Resta
@Matematicas
@SamsungS23
Feature: Suma de una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder sumar un numero con
  # un resultado de incremento

  Scenario: Verificar Suma Numerica Exitosa
    Given yo quiero sumar "9" con el numero "8"
    When realizo la operacion de "addition"
    Then finalmente como resultado tendre "17"