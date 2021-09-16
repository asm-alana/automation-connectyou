package com.sapsf.hcm19.page.perfil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sapsf.hcm19.core.setup.PaginaBase;

public class ConnectYouPerfilTela extends PaginaBase {

	public ConnectYouPerfilTela(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "customHeaderModulePickerBtn-inner")
	public WebElement btnInicio;

	@FindBy(css = "#__item7-__list4-7")
	public WebElement btnPerfil;

	@FindBy(id = "__picker1-fullName")
	public WebElement txtNomeCompleto;

	@FindBy(id = "__xmlview0--locationTimezone")
	public WebElement txtEmpresa;

	@FindBy(id = "__link1")
	public WebElement txtEmail;
}
