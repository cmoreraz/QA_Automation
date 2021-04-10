package com.choucair.phptravels.questions;

import com.choucair.phptravels.userinterface.PostPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PostCreate implements Question<Boolean> {

	private String question;

	public PostCreate(String question) {
		this.question = question;
	}

	public static PostCreate toThe(String question) {
		return new PostCreate(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		boolean result;
		
		String post  = Text.of( PostPage.LABEL_POST ).viewedBy(actor).asString();
		
		if ( question.equals( post ) ) {
			result = true;
		} else {
			result = false;
		}				
		return result;
	}

}
