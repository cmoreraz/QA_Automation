package com.choucair.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import com.choucair.phptravels.userinterface.PackagePage;
import com.choucair.phptravels.utils.GenericTime;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterButtonPaymentPackage implements Task {

	public static EnterButtonPaymentPackage enterPayment() {
		return Tasks.instrumented( EnterButtonPaymentPackage.class );
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			actor.attemptsTo( GenericTime.WaitUntil( PackagePage.BUTTON_PYAMENT ), Click.on( PackagePage.BUTTON_PYAMENT ) );
		
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
