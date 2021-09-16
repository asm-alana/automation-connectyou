package com.sapsf.hcm19.steps.aprendizagem;

import com.sapsf.hcm19.page.aprendizagem.ConnectYouAprendizagemAtividade;

import io.cucumber.java.pt.Quando;

public class AprendizagemStepsAcao {

	ConnectYouAprendizagemAtividade connectYouAprendizagemAtividade = new ConnectYouAprendizagemAtividade();
	
	@Quando("seleciono a funcionalidade Aprendizagem")
	public void selecionoAFuncionalidadeAprendizagem() {
		connectYouAprendizagemAtividade.selecionoAFuncionalidadeAprendizagem();
	}
	
	@Quando("busco por {string} no campo Procurar Aprendizagem")
	public void buscoPorNoCampoProcurarAprendizagem(String cursoBusca ) {
		connectYouAprendizagemAtividade.buscoPorNoCampoProcurarAprendizagem(cursoBusca);
	}
}
