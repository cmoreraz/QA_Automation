#Autor: Andres
Feature: Inicio de sesion

  Scenario Outline: Inicio de sesion exitosa
    Given que estoy en la pagina de inicio de PuntoRed
    When ingreso mis credenciales
    | strEmail   | strPassword   |
    | <strEmail> | <strPassword> |

    Examples: 
    | strEmail | strPassword |
  	##@externaldata@./src/test/resources/dataTestCase.xlsx@datalogin@