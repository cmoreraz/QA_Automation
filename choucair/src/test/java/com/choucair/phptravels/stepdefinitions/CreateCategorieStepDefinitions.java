package com.choucair.phptravels.stepdefinitions;

import com.choucair.phptravels.tasks.EnterButtonAddCategorie;
import com.choucair.phptravels.tasks.SelectMenuBlog;
import com.choucair.phptravels.tasks.SelectSubMenuBlogCat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
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
}
