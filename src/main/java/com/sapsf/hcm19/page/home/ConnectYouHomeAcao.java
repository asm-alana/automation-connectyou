package com.sapsf.hcm19.page.home;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouHomeAcao {

	ConnectYouHomeTela connectYouHomeTela = new ConnectYouHomeTela(getDriver());

	public void selecionoOMenuFeedbackContinuo() {
		ComandosUteis.pausar(2000);
		connectYouHomeTela.btnInicio.click();
		connectYouHomeTela.btnFeedback.click();
	}

	public void clicoNoBotaoConnectYou() {
		ComandosUteis.pausar(2000);
		connectYouHomeTela.btnLogoYaman.click();
		
	}
	
}
