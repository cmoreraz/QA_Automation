package com.choucair.phptravels.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(	features	= "src/test/resources/com/choucair/phptravels/features/CreatePost.feature",
					glue		= "com.choucair.phptravels.stepdefinitions",
					snippets 	= SnippetType.CAMELCASE)
public class CreatePostRunner {
	 
}