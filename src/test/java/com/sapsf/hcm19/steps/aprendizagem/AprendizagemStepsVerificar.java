package com.sapsf.hcm19.steps.aprendizagem;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;
import com.sapsf.hcm19.page.aprendizagem.ConnectYouAprendizagemTela;
import com.sapsf.hcm19.page.aprendizagem.ConnectYouAprendizagemVerificar;
import io.cucumber.java.pt.Entao;

public class AprendizagemStepsVerificar {
	
	ConnectYouAprendizagemTela connectYouAprendizagemTela = new ConnectYouAprendizagemTela(getDriver());
	ConnectYouAprendizagemVerificar connectYouAprendizagemVerificar = new ConnectYouAprendizagemVerificar();
	
	@Entao("visualizarei o resultado {string} na tela")
	public void visualizareiOResultadoNaTela(String resultCursoBusca) {
	    connectYouAprendizagemVerificar.visualizareiOResultadoNaTela(resultCursoBusca);
	}
	
	@Entao("visualizarei a mensagem {string} na tela")
	public void visualizareiAMensagemNaTela(String msgErro) {
	    connectYouAprendizagemVerificar.visualizareiAMensagemNaTela(msgErro);
	}
}
