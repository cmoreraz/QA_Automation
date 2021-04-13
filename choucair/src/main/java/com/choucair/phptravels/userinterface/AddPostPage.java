package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AddPostPage {

	public static final Target INPUT_TITLE 	= Target.the("Input name post").located(By.name("title"));
	public static final Target INPUT_LINK  	= Target.the("Input url post").located(By.name("slug"));
	public static final Target SELECT_CAT	= Target.the("Select categorie").located(By.name("category"));
	public static final Target SELECT_NAME_CAT	= Target.the("Select name categorie").located(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select/option[6]"));
	public static final Target INPUT_KEYWORDS	= Target.the("Input keywords").located(By.name("keywords"));
	public static final Target INPUT_DESC		= Target.the("Input description post").located(By.name("metadesc"));
	
	public static final Target BUTTON_SUBMIT 	= Target.the("Enter button add post").located(By.xpath("//*[@id=\"content\"]/form/div[1]/div/div[2]/button"));
}
