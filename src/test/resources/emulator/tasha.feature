@SmokeTestEmulator
@Suma
@emulator
@tasha
Feature: Suma de una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder sumar un numero con
  # un resultado de incremento

  Scenario: Verificar Suma Numerica Exitosa
    Given usuario tiene "8" numero y el numero "3"
    When usuario realiza la operacion de "subtraction"
    Then resultado de la operacion sera "4"