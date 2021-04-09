package com.choucair.phptravels.tasks;

import com.choucair.phptravels.userinterface.AddCategoriesPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class InputFormCategorie implements Task {

	private String txtName;
	private String txtTurkish;
	private String txtArabic;
	private String txtGerman;
	private String txtVietnamese;
	private String txtSpanish;
	private String txtRussian;
	private String txtFarsi;
	private String txtFrench;

	public InputFormCategorie( String strName, String strTurkish, String strArabic, String strGerman, String strVietnamese,
			String strSpanish, String strRussian, String strFarsi, String strFrench ) {
		this.txtName 		= strName;
		this.txtTurkish 	= strTurkish;
		this.txtArabic 		= strArabic;
		this.txtGerman 		= strGerman;
		this.txtVietnamese 	= strVietnamese;
		this.txtSpanish 	= strSpanish;
		this.txtRussian 	= strRussian;
		this.txtFarsi 		= strFarsi;
		this.txtFrench 		= strFrench;
	}

	public static InputFormCategorie onThePage( String strName, String strTurkish, String strArabic, String strGerman, String strVietnamese,
			String strSpanish, String strRussian, String strFarsi, String strFrench ) {
		return Tasks.instrumented( InputFormCategorie.class, strName, strTurkish, strArabic, strGerman, strVietnamese,
				strSpanish, strRussian, strFarsi, strFrench );
	}

	@Override
	public <T extends Actor> void performAs( T actor ) {
		actor.attemptsTo(
				Enter.theValue( txtName ).into( AddCategoriesPage.INPUT_NAME ),
				Enter.theValue( txtTurkish ).into( AddCategoriesPage.INPUT_TR ),
				Enter.theValue( txtArabic ).into( AddCategoriesPage.INPUT_AR ),
				Enter.theValue( txtGerman ).into( AddCategoriesPage.INPUT_DE ),
				Enter.theValue( txtVietnamese ).into( AddCategoriesPage.INPUT_VI ),
				Enter.theValue( txtSpanish ).into( AddCategoriesPage.INPUT_ES ),
				Enter.theValue( txtRussian ).into( AddCategoriesPage.INPUT_RU ),
				Enter.theValue( txtFarsi ).into( AddCategoriesPage.INPUT_FA ),
				Enter.theValue( txtFrench ).into( AddCategoriesPage.INPUT_FR ),
				Click.on( AddCategoriesPage.BUTTON_ADD )
				);
	}
}
