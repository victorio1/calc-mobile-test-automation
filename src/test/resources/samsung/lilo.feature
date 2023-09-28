@SmokeTestSamsung
@Samsung-02
@Resta
@SamsungS23
Feature: Resta en una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder restar un numero con
  # un resultado negativo

  Scenario: Verificar Resta Numerica Exitosa
    Given yo quiero operar "9" con el numero "8"
    When realizo la operacion de "subtraction"
    Then finalmente como resultado tendre "1"