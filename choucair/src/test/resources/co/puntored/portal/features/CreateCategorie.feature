@Stories
Feature: Recarga

  Background: Inicio de sesion exitosa
    Given que estoy en la pagina de inicio de PuntoRed
    When ingreso mis credenciales
      |strEmail|strPassword|
      ##@externaldata@./src/test/resources/dataTestCase.xlsx@datalogin@

  Scenario Outline: Recarga
    Given selecciono el modulo de recargas
    And selecciono el operador de recarga
      | strOperador   |
      | <strOperador> |
    Then digito el numero y selecciono el valor
      | strNumber   | strValor   |
      | <strNumber> | <strValor> |
    And doy click en el boton continuar
    Then valido la clave
      | strPassword  |
      | <strPassword> |
    And doy clic en el boton continuar
    Then valido que aparezca la tirilla de recarga
    	| strQuestion  |
      | <strQuestion> |
    And valido los logs de recarga

    Examples: 
      |strNumber|strPassword|strOperador|strValor|strQuestion|
      ##@externaldata@./src/test/resources/dataTestCase.xlsx@categorie@

