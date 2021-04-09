package com.choucair.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import com.choucair.phptravels.userinterface.PostPage;
import com.choucair.phptravels.utils.GenericTime;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterButtonAddPost implements Task {

	public static EnterButtonAddPost enterButtonAddPost() {
		return Tasks.instrumented( EnterButtonAddPost.class );
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			actor.attemptsTo( GenericTime.WaitUntil( PostPage.BUTTON_ADD ), Click.on( PostPage.BUTTON_ADD ) );
		
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
