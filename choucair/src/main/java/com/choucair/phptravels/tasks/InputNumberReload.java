package com.choucair.phptravels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class InputNumberReload implements Task {

	private String strNumber;
	
	public InputNumberReload( String strNumber) {
		this.strNumber = strNumber;
	}
	
	public static InputNumberReload inputNumber( String strNumber) {
		return Tasks.instrumented( InputNumberReload.class, strNumber );
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( Enter.theValue( strNumber ).into(  ) );		
	}

}
