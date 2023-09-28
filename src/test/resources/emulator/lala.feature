@SmokeTestEmulator
@Division
@emulator
@lala
Feature: Division de una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder dividir un numero con
  # un resultado divisor

  Scenario: Verificar Division Numerica Exitosa
    Given usuario tiene "9" numero y el numero "3"
    When usuario realiza la operacion de "division"
    Then resultado de la operacion sera "3"