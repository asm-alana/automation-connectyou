package com.sapsf.hcm19.page.login;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

public class ConnectYouLoginVerificar {

	ConnectYouLoginTela connectYouLoginTela = new ConnectYouLoginTela(getDriver());
	
	public void visualizareiOMenuInicioNaTela() {
		connectYouLoginTela.btnInicio.isDisplayed();
	}
	
}
