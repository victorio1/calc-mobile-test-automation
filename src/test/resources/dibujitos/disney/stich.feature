@SmokeTest
@Disney
@Multiplicacion
@Matematicas
Feature: Multiplicacion de una calculadora
  # En este feature nosotros vamos a agregar
  # una funcionalidad que la calculadora realiza
  # con el objetivo de poder multiplicar un numero con
  # un resultado incrementado

  Scenario: Verificar Multiplicacion Numerica Exitosa
    Given usuario tiene "9" numero y el numero "9"
    When usuario realiza la operacion de "multiplication"
    Then resultado de la operacion sera "81"