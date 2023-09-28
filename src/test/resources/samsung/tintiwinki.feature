@SmokeTestSamsung
@Samsung-04
@TablaDel2
@SamsungS23
@RealMadrid
Feature: Tabla del 2 por una calculadora
  # En este feature vamos a realizar la tabla
  # del 2 mediante multiplicaciones secuenciales
  # utilizando escenario outline mediante cucumber
  # y además hemos creado un metodo para contabilizar los
  # digitos hasta 3 cifras

  Scenario Outline: Verificar la multiplicacion de la tabla del 2
    Given yo quiero operar "<number1>" con el numero "<number2>"
    When realizo la operacion de "multiplication"
    Then finalmente como resultado tendre "<result>"

    Examples:
    | number1 | number2 | result |
    |   0     |    2    |    0   |
    |   1     |    2    |    2   |
    |   2     |    2    |    4   |
    |   3     |    2    |    6   |
    |   4     |    2    |    8   |
    |   5     |    2    |    10  |
    |   6     |    2    |    12  |
    |   7     |    2    |    14  |
    |   8     |    2    |    16  |
    |   9     |    2    |    18  |
    |   10    |    2    |    20  |
    |   11    |    2    |    22  |
    |   12    |    2    |    24  |
    |   120   |   120   | 14400  |
