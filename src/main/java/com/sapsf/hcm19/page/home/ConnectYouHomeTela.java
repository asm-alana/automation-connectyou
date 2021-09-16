package com.sapsf.hcm19.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sapsf.hcm19.core.setup.PaginaBase;

public class ConnectYouHomeTela extends PaginaBase {

	public ConnectYouHomeTela(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="customHeaderModulePickerBtn-inner")
	public WebElement btnInicio;
	
	@FindBy(css="#__item7-__list4-3")
	public WebElement btnFeedback;
	
	@FindBy(id="bizXHeaderCompanyLogo")
	public WebElement btnLogoYaman;
	
	@FindBy(id="customHeaderModulePickerBtn-BDI-content")
	public WebElement txtBotaoInicio;
}
