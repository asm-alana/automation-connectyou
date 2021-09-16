package com.sapsf.hcm19.page.logout;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

public class ConnectYouLogoutVerificar {

	ConnectYouLogoutTela connectYouLogoutTela = new ConnectYouLogoutTela(getDriver());

	public void souRedirecionadoParaATelaDeLogin() {
		connectYouLogoutTela.campoUsuarioLogin.isDisplayed();

	}

}
