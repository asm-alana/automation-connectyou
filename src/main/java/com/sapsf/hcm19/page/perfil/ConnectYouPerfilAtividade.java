package com.sapsf.hcm19.page.perfil;

import com.sapsf.hcm19.core.setup.ComandosUteis;
import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

public class ConnectYouPerfilAtividade {

	ConnectYouPerfilAcao connectYouPerfilAcao = new ConnectYouPerfilAcao();
	ConnectYouPerfilTela connectYouPerfilTela = new ConnectYouPerfilTela(getDriver());

	public void selecionoOMenuPerfil() {
		ComandosUteis.pausar(2000);
		connectYouPerfilAcao.selecionoOBotaoInicio();

		if (connectYouPerfilTela.btnPerfil.isEnabled()) {
			connectYouPerfilAcao.selecionoOBotaoPerfil();
		} else {
			ComandosUteis.pausar(3000);
			connectYouPerfilAcao.selecionoOBotaoPerfil();
		}

	}
}