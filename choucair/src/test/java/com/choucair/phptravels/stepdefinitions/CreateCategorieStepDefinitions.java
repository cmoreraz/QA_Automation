package com.choucair.phptravels.stepdefinitions;

import java.util.List;

import com.choucair.phptravels.models.ReloadData;
import com.choucair.phptravels.questions.NeckbandReload;
import com.choucair.phptravels.utils.GenericTime;

import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreateCategorieStepDefinitions {
	
	@Entonces("^valido que aparezca la tirilla de recarga$")
	public void validoLaTirillaRecarga( List<ReloadData> dataRecarga ) throws Exception {
		GenericTime.three();
		OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat( NeckbandReload.toThe( dataRecarga.get(0).getStrQuestion() ) ));
	}
	
}
