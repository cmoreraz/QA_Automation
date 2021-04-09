package com.choucair.phptravels.utils;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GenericTime {

	//Espera que se muestre el elemento
	public static Interaction WaitUntil( Target target ) throws Exception {
		return WaitUntil.the( target, isVisible() ).forNoMoreThan(10).seconds();
	}

	public static void three() {
		try {
			Thread.sleep( 3000 );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
