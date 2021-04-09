package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AddCategoriesPage {
	
	public static final Target INPUT_NAME = Target.the("Input name categorie").located(By.name("name"));
	public static final Target SELECT_STATUS = Target.the("Input name categorie").located(By.name("status"));
	public static final Target INPUT_TR	= Target.the("Input name in Turkish").located(By.name("translated[tr][name]"));
	public static final Target INPUT_AR	= Target.the("Input name in Arabic").located(By.name("translated[ar][name]"));
	public static final Target INPUT_DE	= Target.the("Input name in German").located(By.name("translated[de][name]"));
	public static final Target INPUT_VI	= Target.the("Input name in Vietnamese").located(By.name("translated[vi][name]"));
	public static final Target INPUT_ES	= Target.the("Input name in Spanish").located(By.name("translated[es][name]"));
	public static final Target INPUT_RU	= Target.the("Input name in Russian").located(By.name("translated[ru][name]"));
	public static final Target INPUT_FA	= Target.the("Input name in Farsi").located(By.name("translated[fa][name]"));
	public static final Target INPUT_FR	= Target.the("Input name in French").located(By.name("translated[fr][name]"));
	
	public static final Target BUTTON_ADD = Target.the("Enter button add").located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]"));
}
