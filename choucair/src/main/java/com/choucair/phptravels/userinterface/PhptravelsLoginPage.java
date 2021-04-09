package com.choucair.phptravels.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhptravelsLoginPage {

    public static final Target INPUT_EMAIL 			= Target.the("Input email").located(By.name("email"));    
    public static final Target INPUT_PASSWORD 		= Target.the("Input password").located(By.name("password"));    
    public static final Target ENTER_BUTTON_LOGIN 	= Target.the("Enter button login").located(By.xpath("/html/body/div[2]/form[1]/button"));
   
}
