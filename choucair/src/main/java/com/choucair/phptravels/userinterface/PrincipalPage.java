package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/**
 * 
 * @author cristian.morera
 *
 */
public class PrincipalPage {
	
	public static final Target IMG_RELOAD 	= Target.the( "Selecciona producto recargas" ).located(By.xpath( "//p[text()='Recargas']" ));
	public static final Target IMG_PACKAGE 	= Target.the( "Selecciona producto paquetes" ).located(By.xpath( "//p[text()='Paquetes']" ));
	public static final Target IMG_DAVIVIENDA = Target.the( "Selecciona producto davivienda" ).located(By.xpath( "//img[contains(@src,'https://storage.googleapis.com/cxr-portal-img/IconsWEBP/daviplata.webp')]" ));

}
