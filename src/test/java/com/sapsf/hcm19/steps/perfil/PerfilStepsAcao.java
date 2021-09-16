package com.sapsf.hcm19.steps.perfil;

import com.sapsf.hcm19.page.perfil.ConnectYouPerfilAtividade;

import io.cucumber.java.pt.Quando;

public class PerfilStepsAcao {
	
	ConnectYouPerfilAtividade connectYouPerfilAtividade = new ConnectYouPerfilAtividade();
	
	@Quando("seleciono o menu Perfil")
	public void selecionoOMenuPerfil() {
	    connectYouPerfilAtividade.selecionoOMenuPerfil();
	}
}
