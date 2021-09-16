package com.sapsf.hcm19.page.aprendizagem;

import com.sapsf.hcm19.core.setup.PaginaBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConnectYouAprendizagemTela extends PaginaBase {
	
	public ConnectYouAprendizagemTela(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "customHeaderModulePickerBtn-inner")
	public WebElement btnInicio;
	
	@FindBy(id = "customHeaderModulePickerBtn-menuPopover-cont")
	public WebElement janelaPopUp;
	
	@FindBy(css = "#__item7-__list4-4")
	public WebElement btnAprendizagem;
	
	@FindBy(id = "79:_txtFld")
	public WebElement campoProcurarAprendizagem;
	
	@FindBy(xpath = "//div[@class='catalogListItemBaseTitle']//*[contains(., 'Automação')]")
	public WebElement txtResultadoCursoBusca;
	
	@FindBy(id = "__xmlview1--coursesViewContent--groupedList-nodata-text")
	public WebElement txtMsgErro;
}
