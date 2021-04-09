package com.choucair.phptravels.questions;

import com.choucair.phptravels.userinterface.PackagePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NeckbandPackage implements Question<Boolean> {

	private String question;

	public NeckbandPackage(String question) {
		this.question = question;
	}

	public static NeckbandPackage toThe(String question) {
		return new NeckbandPackage(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		boolean result;

		String tirilla = Text.of( PackagePage.LABEL_NECKBAND ).viewedBy(actor).asString();

		if ( question.equals(tirilla) ) {
			result = true;
		} else {
			result = false;
		}	
		return result;
	}

}
