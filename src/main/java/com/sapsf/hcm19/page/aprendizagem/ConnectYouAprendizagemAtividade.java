package com.sapsf.hcm19.page.aprendizagem;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouAprendizagemAtividade {

	ConnectYouAprendizagemAcao connectYouAprendizagemAcao = new ConnectYouAprendizagemAcao();
	ConnectYouAprendizagemTela connectYouAprendizagemTela = new ConnectYouAprendizagemTela(getDriver());

	public void selecionoAFuncionalidadeAprendizagem() {
		
		ComandosUteis.pausar(2000);
		connectYouAprendizagemAcao.selecionoOBotaoAprendizagem();
	}

	public void buscoPorNoCampoProcurarAprendizagem(String cursoBusca) {
		
		try {
			if(connectYouAprendizagemTela.campoProcurarAprendizagem.isDisplayed()) {
				connectYouAprendizagemAcao.buscoCursoNoCampoProcurarAprendizagem(cursoBusca);
			}else {
				ComandosUteis.pausar(2000);
				connectYouAprendizagemAcao.buscoCursoNoCampoProcurarAprendizagem(cursoBusca);
			}
		} catch (Exception e) {
			System.out.println("Acessou a Exception do campo Procurar Aprendizagem");
		}
	}
	
}
