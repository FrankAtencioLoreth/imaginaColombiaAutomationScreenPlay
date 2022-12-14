Feature: Busqueda de guia
  Como usuario
  Quiero poder buscar una guia aerea
  Para ver el seguimiento

  @BusquedaConResultado
  Scenario Outline: Busqueda de guia
  Given El usuario abrela pagina web
  When El usuario ingrea un codigo valido <codigoCorrecto>
  Then El usuario ve la guia de seguimiento <textoValidacion>
  Examples:
    | codigoCorrecto | textoValidacion |
    | 98880364745    | AWB Details     |