@EndToEnd
@COM-8756
@Suma
@Matematicas
  Feature: Resta en una calculadora
    # En este feature nosotros vamos a agregar
    # una funcionalidad que la calculadora realiza
    # con el objetivo de poder restar un numero con
    # un resultado menor

  Scenario: Resta Numerica Exitosa
    Given usuario tiene "9" numero y el numero "7"
    When usuario realiza la operacion de "addition"
    Then resultado de la operacion sera "7"