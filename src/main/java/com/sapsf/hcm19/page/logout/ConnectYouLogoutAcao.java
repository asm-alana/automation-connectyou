package com.sapsf.hcm19.page.logout;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouLogoutAcao {
	
	ConnectYouLogoutTela connectYouLogoutTela = new ConnectYouLogoutTela(getDriver());
	
	public void clicoEmSairNoMenuNavegacaoDoUsuario() {
		ComandosUteis.pausar(3000);
		connectYouLogoutTela.btnMenuComFoto.click();
		if(connectYouLogoutTela.btnSair.isEnabled()) {
			connectYouLogoutTela.btnSair.click();	
		} else {
			ComandosUteis.pausar(3000);
			connectYouLogoutTela.btnSair.click();
		}
	}

}
