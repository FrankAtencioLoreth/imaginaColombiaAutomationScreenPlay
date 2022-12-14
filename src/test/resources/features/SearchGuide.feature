Feature: Busqueda de guia
  Como usuario
  Quiero poder buscar una guia aerea
  Para ver el seguimiento

  #Busqueda Con Resultado
  @smokeTest
  Scenario Outline: Busqueda de guia con resultados
    Given El usuario abrela pagina web
    When El usuario ingresa un codigo <codigoValido>
    Then El usuario ve la guia de seguimiento <textoValidacion>
    Examples:
      | codigoValido | textoValidacion |
      | 98880364745  | AWB Details     |

  #Busqueda Sin Resultado
  @smokeTest
  Scenario Outline: Busqueda de guia sin resultados
    Given El usuario abrela pagina web
    When El usuario ingresa un codigo <codigoInvalido>
    Then El usuario no ve ningun resultado <textoValidacion>
    Examples:
      | codigoInvalido | textoValidacion                                                       |
      | 3544556        | Could not find AWB 354-4556. Please check your request and try again. |