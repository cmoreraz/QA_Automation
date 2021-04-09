package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriesPage {
	
	public static final Target BUTTON_ADD 	= Target.the("Select button add categorie").located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/button"));
	public static final Target LABEL_CAT 	= Target.the("Validate name categorie").located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]"));
	
}
