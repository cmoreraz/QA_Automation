package com.choucair.phptravels.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.choucair.phptravels.userinterface.AddPostPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class InputFormPost implements Task {
	
	private String txtTitle;
	private String txtLink;
	private String txtCont;
	private String txtKeywords;
	private String txtDescription;
	public static int contador = 0;

	public InputFormPost( String strTitle, String strLink, String strCont, String strKeywords, String strDescription ) {
		this.txtTitle 		= strTitle;
		this.txtLink		= strLink;
		this.txtCont 		= strCont;
		this.txtKeywords 	= strKeywords;
		this.txtDescription = strDescription;
	}

	public static InputFormPost onThePage( String strTitle, String strLink, String strCont, String strKeywords, String strDescription ) {
		return Tasks.instrumented( InputFormPost.class, strTitle, strLink, strCont, strKeywords, strDescription );
	}

	@Override
	public <T extends Actor> void performAs( T actor ) { 
		
		@SuppressWarnings("unchecked")
		List<WebElement> cat = (List<WebElement>) AddPostPage.SELECT_CAT;
		
		for (int i = 0; i < cat.size(); i++) {
			System.out.println(i);
			contador++;			
		}	
		
		actor.attemptsTo(
				Enter.theValue( txtTitle ).into( AddPostPage.INPUT_TITLE ),
				Enter.theValue( txtLink, Keys.TAB, txtCont ).into( AddPostPage.INPUT_LINK ),
				Enter.theValue( txtKeywords ).into( AddPostPage.INPUT_KEYWORDS ),
				Enter.theValue( txtDescription ).into( AddPostPage.INPUT_DESC ),
				Click.on( AddPostPage.SELECT_NAME_CAT ),
				Click.on( AddPostPage.BUTTON_SUBMIT )
				);
	}
}
