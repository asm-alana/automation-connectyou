package com.sapsf.hcm19.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sapsf.hcm19.core.setup.PaginaBase;

public class ConnectYouLoginTela extends PaginaBase {

	public ConnectYouLoginTela(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "__input0-inner")
	public WebElement campoIdEmpresa;
	
	@FindBy(id = "__button0")
	public WebElement btnProsseguirIdEmpresa;
	
	@FindBy(id = "__input1-inner")
	public WebElement campoUsuarioLogin;
	
	@FindBy(id = "__input2-inner")
	public WebElement campoSenhaLogin;

	@FindBy(id = "customHeaderModulePickerBtn-inner")
	public WebElement btnInicio;
}
