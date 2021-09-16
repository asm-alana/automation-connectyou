package com.sapsf.hcm19.page.perfil;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;;

public class ConnectYouPerfilAcao {

	ConnectYouPerfilTela connectYouPerfilTela = new ConnectYouPerfilTela(getDriver());

	public void selecionoOBotaoInicio() {
		connectYouPerfilTela.btnInicio.click();
	}

	public void selecionoOBotaoPerfil() {
		connectYouPerfilTela.btnPerfil.click();
	}
}
