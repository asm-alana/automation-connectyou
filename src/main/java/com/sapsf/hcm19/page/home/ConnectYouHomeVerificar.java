package com.sapsf.hcm19.page.home;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

public class ConnectYouHomeVerificar {
	
	ConnectYouHomeTela connectYouHomeTela = new ConnectYouHomeTela(getDriver());
	
	public void souRedirecionadoParaAPaginaInicialDoSite() {
		connectYouHomeTela.txtBotaoInicio.isDisplayed();		
	}
}
