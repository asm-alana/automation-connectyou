package com.sapsf.hcm19.page.aprendizagem;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import org.junit.jupiter.api.Assertions;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouAprendizagemVerificar {
	
	ConnectYouAprendizagemTela connectYouAprendizagemTela = new ConnectYouAprendizagemTela(getDriver());
	
	public void visualizareiOResultadoNaTela(String resultCursoBusca) {
		ComandosUteis.pausar(5000);
		Assertions.assertEquals(resultCursoBusca, connectYouAprendizagemTela.txtResultadoCursoBusca.getText());
	}

	public void visualizareiAMensagemNaTela(String msgErro) {
		Assertions.assertEquals(msgErro, connectYouAprendizagemTela.txtMsgErro.getText());
	}

}
