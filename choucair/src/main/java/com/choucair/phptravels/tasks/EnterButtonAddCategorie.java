package com.choucair.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import com.choucair.phptravels.userinterface.CategoriesPage;
import com.choucair.phptravels.utils.GenericTime;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterButtonAddCategorie implements Task {

	public static EnterButtonAddCategorie enterButtonAddCategorie() {
		return Tasks.instrumented( EnterButtonAddCategorie.class );
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			actor.attemptsTo( GenericTime.WaitUntil( CategoriesPage.BUTTON_ADD ), Click.on( CategoriesPage.BUTTON_ADD ) );
		
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
