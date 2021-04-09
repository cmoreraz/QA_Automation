package com.choucair.phptravels.runners;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.choucair.phptravels.datadriven.BeforeSuite;
import com.choucair.phptravels.datadriven.DatosAlFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(	features	= "src/test/resources/co/puntored/portal/features/CreateCategorie.feature",
					glue		= "com.choucair.phptravels.stepdefinitions",
					snippets 	= SnippetType.CAMELCASE)
public class CreateCategorieRunner {
	
	@BeforeSuite
	public static void test() throws IOException {
		DatosAlFeature.overrideFeatureFiles( "./src/test/resources/co/puntored/portal/features/CreateCategorie.feature" );
	} 
}