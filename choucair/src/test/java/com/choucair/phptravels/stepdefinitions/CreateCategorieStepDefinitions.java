package com.choucair.phptravels.stepdefinitions;

import java.util.List;

import com.choucair.phptravels.models.CategorieData;
import com.choucair.phptravels.questions.CategorieCreate;
import com.choucair.phptravels.tasks.EnterButtonAddCategorie;
import com.choucair.phptravels.tasks.InputFormCategorie;
import com.choucair.phptravels.tasks.SelectMenuBlog;
import com.choucair.phptravels.tasks.SelectSubMenuBlogCat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreateCategorieStepDefinitions {


	@Given("^Select menu blog$")
	public void selectMenuBlog() {
		OnStage.theActorInTheSpotlight().attemptsTo( SelectMenuBlog.selectMenuBlog() );
	}

	@When("^Select submenu blog categories$")
	public void selectSubmenuBlogCategories() {
		OnStage.theActorInTheSpotlight().attemptsTo( SelectSubMenuBlogCat.selectSubMenuBlogCat() );
	}

	@When("^Enter button add categorie$")
	public void enterButtonAddCategorie() {
		OnStage.theActorInTheSpotlight().attemptsTo( EnterButtonAddCategorie.enterButtonAddCategorie() );
	}

	@Then("^Enter the form data and add the category$")
	public void enterTheFormDataAndAddTheCategory( List<CategorieData> dataCategorie ) {
		OnStage.theActorInTheSpotlight().attemptsTo( InputFormCategorie.onThePage( 
				dataCategorie.get(0).getTxtName(), 		
				dataCategorie.get(0).getTxtTurkish(), 
				dataCategorie.get(0).getTxtArabic(), 	
				dataCategorie.get(0).getTxtGerman(), 
				dataCategorie.get(0).getTxtVietnamese(), 
				dataCategorie.get(0).getTxtSpanish(), 
				dataCategorie.get(0).getTxtRussian(), 
				dataCategorie.get(0).getTxtFarsi(), 
				dataCategorie.get(0).getTxtFrench()) );
	}
	
	@Then("^Validate categorie create$")
	public void validateCategorieCreate( List<CategorieData> dataCategorie ) throws Exception {
		OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat( CategorieCreate.toThe( dataCategorie.get(0).getStrNameCategorie())));
	}
}
