package com.choucair.phptravels.tasks;

import com.choucair.phptravels.userinterface.PhptravelsLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class Login implements Task {

    private String strEmail;
    private String strPassword;

    public Login( String strEmail, String strPassword ) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public static Login onThePage( String strEmail, String strPassword ) {
        return Tasks.instrumented( Login.class, strEmail, strPassword );
    }

    @Override
    public <T extends Actor> void performAs( T actor ) {
        actor.attemptsTo(
        		Enter.theValue( strEmail ).into( PhptravelsLoginPage.INPUT_EMAIL ),
                Enter.theValue( strPassword ).into( PhptravelsLoginPage.INPUT_PASSWORD ),
                Click.on( PhptravelsLoginPage.ENTER_BUTTON_LOGIN )
        );
    }
}
