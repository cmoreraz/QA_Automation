package com.choucair.phptravels.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NeckbandReload implements Question<Boolean> {

	private String question;

	public NeckbandReload(String question) {
		this.question = question;
	}

	public static NeckbandReload toThe(String question) {
		return new NeckbandReload(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		boolean result;
		
		String tirilla = null;// = Text.of( ReloadPage.LABEL_NECKBAND ).viewedBy(actor).asString();
		
		if ( question.equals(tirilla) ) {
			result = true;
		} else {
			result = false;
		}				
		return result;
	}

}
