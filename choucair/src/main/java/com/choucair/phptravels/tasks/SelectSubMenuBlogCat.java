package com.choucair.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import com.choucair.phptravels.userinterface.PrincipalPage;
import com.choucair.phptravels.utils.GenericTime;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSubMenuBlogCat implements Task {
	
	public static SelectSubMenuBlogCat selectSubMenuBlogCat() {
		return Tasks.instrumented( SelectSubMenuBlogCat.class );
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo( GenericTime.WaitUntil( PrincipalPage.BUTTON_BLOG_CAT ), Click.on( PrincipalPage.BUTTON_BLOG_CAT ) );
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch ( Exception e ) {
			e.printStackTrace();
		}		
	}

}
