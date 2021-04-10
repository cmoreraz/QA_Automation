package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PostPage {
	
	public static final Target BUTTON_ADD 	= Target.the("Select button add post").located(By.xpath("//*[@id=\"content\"]/div[2]/form/button"));
	public static final Target LABEL_POST 	= Target.the("Validate name post create").located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]/a"));
	
}
