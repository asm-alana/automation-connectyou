package com.sapsf.hcm19.steps.login;

import com.sapsf.hcm19.page.login.ConnectYouLoginVerificar;

import io.cucumber.java.pt.Entao;

public class LoginStepsVerificar {

	ConnectYouLoginVerificar connectYouLoginVerificar = new ConnectYouLoginVerificar();
	
	@Entao("visualizarei o menu Inicio na tela")
	public void visualizareiOMenuInicioNaTela() {
	    connectYouLoginVerificar.visualizareiOMenuInicioNaTela();
	}
}
