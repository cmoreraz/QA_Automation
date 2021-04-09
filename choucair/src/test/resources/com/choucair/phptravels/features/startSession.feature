#Autor: Andres
Feature: Login to the phptravels page

  Scenario Outline: login to the phptravels page
    Given que estoy en la pagina de inicio de PuntoRed
    When ingreso mis credenciales
    | strEmail   | strPassword   |
    | <strEmail> | <strPassword> |

    Examples: 
    | strEmail | strPassword |