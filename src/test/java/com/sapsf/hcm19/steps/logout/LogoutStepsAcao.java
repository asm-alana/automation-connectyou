package com.sapsf.hcm19.steps.logout;

import com.sapsf.hcm19.page.logout.ConnectYouLogoutAcao;

import io.cucumber.java.pt.Quando;

public class LogoutStepsAcao {

	ConnectYouLogoutAcao connectYouLogoutAcao = new ConnectYouLogoutAcao();
	
	@Quando("clico em Sair no menu Navegacao do usuario")
	public void clicoEmSairNoMenuNavegacaoDoUsuario() {
		connectYouLogoutAcao.clicoEmSairNoMenuNavegacaoDoUsuario();
	}

}
