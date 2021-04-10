package com.choucair.phptravels.stepdefinitions;

import java.util.List;

import com.choucair.phptravels.models.PostData;
import com.choucair.phptravels.questions.PostCreate;
import com.choucair.phptravels.tasks.EnterButtonAddPost;
import com.choucair.phptravels.tasks.InputFormPost;
import com.choucair.phptravels.tasks.SelectMenuBlog;
import com.choucair.phptravels.tasks.SelectSubMenuPost;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CreatePostStepDefinitions {

	@Given("^Select menu blog phptravels$")
	public void selectMenuBlogPhptravels() {
		OnStage.theActorInTheSpotlight().attemptsTo( SelectMenuBlog.selectMenuBlog() );
	}
	
	@When("^Select submenu post$")
	public void selectSubmenuPost() {
		OnStage.theActorInTheSpotlight().attemptsTo( SelectSubMenuPost.selectSubMenuPost() );
	}
	
	@When("^Enter button add post$")
	public void enterButtonAddPost() {
		OnStage.theActorInTheSpotlight().attemptsTo( EnterButtonAddPost.enterButtonAddPost() );
	}
	
	@Then("^Enter the form data add the post$")
	public void enterTheFormDataAndAddThePost( List<PostData> dataPost ) {
		OnStage.theActorInTheSpotlight().attemptsTo( InputFormPost.onThePage( 
				dataPost.get(0).getTxtTitle(),
				dataPost.get(0).getTxtLink(),
				dataPost.get(0).getTxtCont(),
				dataPost.get(0).getTxtKeywords(),
				dataPost.get(0).getTxtDescription()) );
	}
	
	@Then("^Validate post create$")
	public void validatePostCreate( List<PostData> dataPost ) {
		OnStage.theActorInTheSpotlight().should( GivenWhenThen.seeThat( PostCreate.toThe( dataPost.get(0).getTxtTitle())));
	}

}
