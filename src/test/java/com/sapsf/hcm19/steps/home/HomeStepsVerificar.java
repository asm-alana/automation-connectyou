package com.sapsf.hcm19.steps.home;

import com.sapsf.hcm19.page.home.ConnectYouHomeVerificar;

import io.cucumber.java.pt.Entao;

public class HomeStepsVerificar {

	ConnectYouHomeVerificar connectYouHomeVerificar = new ConnectYouHomeVerificar();
	
	@Entao("sou redirecionado para a pagina inicial do site")
	public void souRedirecionadoParaAPaginaInicialDoSite() {
		connectYouHomeVerificar.souRedirecionadoParaAPaginaInicialDoSite();
	}

}
