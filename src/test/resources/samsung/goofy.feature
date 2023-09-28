@SmokeTestSamsung
@Samsung-01
@Division
@SamsungS23
Feature: Division en una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder dividir un numero con
  # un resultado menor

  Scenario: Verificar Division Numerica Exitosa
    Given yo quiero operar "9" con el numero "3"
    When realizo la operacion de "division"
    Then finalmente como resultado tendre "3"