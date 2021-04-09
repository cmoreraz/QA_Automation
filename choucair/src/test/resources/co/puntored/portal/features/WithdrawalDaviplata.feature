#language:es
@principalCases
Característica: Retiro

  Antecedentes: Inicio de sesion exitosa
    Dado que estoy en la pagina de inicio de PuntoRed
    Cuando ingreso mis credenciales
    |strTerminal|strPassword|
      ##@externaldata@./src/test/resources/InsumosDatosPrueba.xlsx@Username@
   |311788   |884444|

    Y digito el valor del pin
    |strCode|
      ##@externaldata@./src/test/resources/InsumosDatosPrueba.xlsx@Code@
   |x4dpg|


  Esquema del escenario: Realizar un retiro davivienda
    Cuando Selecciono el producto davivienda
    Y Selecciono el modulo de retiro 
    Entonces Diligencio los campos
    | strNumber   | strKeyCodeConfirmation   | strMoney   | strPassword   |
    | <strNumber> | <strKeyCodeConfirmation> | <strMoney> | <strPassword> |
    
    Y Presiono boton continuar

    Ejemplos: 
    | strNumber  | strKeyCodeConfirmation | strMoney  | strPassword  |
    ##@externaldata@./src/test/resources/InsumosDatosPrueba.xlsx@WithdrawalDavivienda@
    
