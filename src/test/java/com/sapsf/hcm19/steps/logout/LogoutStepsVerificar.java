package com.sapsf.hcm19.steps.logout;

import com.sapsf.hcm19.page.logout.ConnectYouLogoutVerificar;

import io.cucumber.java.pt.Entao;

public class LogoutStepsVerificar {

	ConnectYouLogoutVerificar connectYouLogoutVerificar = new ConnectYouLogoutVerificar();
	
	@Entao("sou redirecionado para a tela de login")
	public void souRedirecionadoParaATelaDeLogin() {
		connectYouLogoutVerificar.souRedirecionadoParaATelaDeLogin();
	}

}
