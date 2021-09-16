package com.sapsf.hcm19.page.logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sapsf.hcm19.core.setup.PaginaBase;

public class ConnectYouLogoutTela extends PaginaBase {

	public ConnectYouLogoutTela(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "utilityLinksMenuId-inner")
	public WebElement btnMenuComFoto;
	
	@FindBy(css = "#utilityLinksMenuId-menuPopover")
	public WebElement menuNavegacaoUsuario;

	@FindBy(css = "#__item7-__list4-4")
	public WebElement btnSair;

	@FindBy(id = "__input1-inner")
	public WebElement campoUsuarioLogin;

}
