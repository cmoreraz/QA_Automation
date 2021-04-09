package com.choucair.phptravels.stepdefinitions;

import java.util.List;

import com.choucair.phptravels.models.LoginData;
import com.choucair.phptravels.tasks.Login;
import com.choucair.phptravels.tasks.OpenBrowser;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * 
 * @author cristian.morera
 * Se realiza inicio de sesion
 *
 */

public class startSessionStepDefinitions {
	
	@Before
    public void setTheStage( ) {
        OnStage.setTheStage( new OnlineCast( ) );
    }

	@Given("^que estoy en la pagina de inicio de PuntoRed$")
	public void queEstoyEnLaPaginaDeInicioDePuntoRed() {
		OnStage.theActorCalled( "Andres" ).wasAbleTo( OpenBrowser.thePage());
	}

	@When("^ingreso mis credenciales$")
	public void ingresoMisCredenciales( List<LoginData> loginData ) {
		OnStage.theActorCalled( "Andres" ).wasAbleTo( OpenBrowser.thePage(), Login.
                onThePage( loginData.get(0).getStrEmail(), loginData.get(0).getStrPassword() ));
	}

}
