package com.choucair.phptravels.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

/**
 * 
 * @author cristian.morera
 *
 */
public class PrincipalPage {
	
	public static final Target BUTTON_BLOG 		= Target.the( "Select button blog" ).located(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[13]/a"));
	public static final Target BUTTON_BLOG_CAT 	= Target.the( "Select button blog categories" ).located(By.xpath("//*[@id=\"Blog\"]/li[2]/a"));
	public static final Target BUTTON_POST 		= Target.the( "Selecciona producto davivienda" ).located(By.xpath("//*[@id=\"Blog\"]/li[1]/a"));

}
