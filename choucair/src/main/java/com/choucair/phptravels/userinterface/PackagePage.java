package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PackagePage {
	
	public static final Target BUTTON_PYAMENT 	= Target.the("Da clic en realizar pago").located(By.xpath( "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/div/div/div[4]/a" ));
	public static final Target LABEL_NECKBAND 	= Target.the("label de tirilla").located(By.xpath( "//*[@id=\"maincontainer\"]/div/div[2]/div/div[1]/span" ));

}
