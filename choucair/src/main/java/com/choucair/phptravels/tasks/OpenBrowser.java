package com.choucair.phptravels.tasks;

import com.choucair.phptravels.userinterface.PhptravelsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

/**
 * 
 * @author cristian.morera
 * Implementa la tarea para abrir la pagina web
 *
 */
public class OpenBrowser implements Task {

    private PhptravelsPage phptravelsPage;

    public static OpenBrowser thePage() {
        return Tasks.instrumented( OpenBrowser.class );
    }

    /**
     * Metodo que realiza las tareas
     */    
    @Override
    public <T extends Actor> void performAs( T actor ) {
        actor.attemptsTo( Open.browserOn( phptravelsPage ));
    }
}
