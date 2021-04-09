package com.choucair.phptravels.questions;

import com.choucair.phptravels.userinterface.CategoriesPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CategorieCreate implements Question<Boolean> {

	private String question;

	public CategorieCreate(String question) {
		this.question = question;
	}

	public static CategorieCreate toThe(String question) {
		return new CategorieCreate(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		boolean result;
		
		String categorie  = Text.of( CategoriesPage.LABEL_CAT ).viewedBy(actor).asString();
		System.out.println(categorie);
		System.out.println( question );
		
		if ( question.equals( categorie ) ) {
			result = true;
		} else {
			result = false;
		}				
		return result;
	}

}
