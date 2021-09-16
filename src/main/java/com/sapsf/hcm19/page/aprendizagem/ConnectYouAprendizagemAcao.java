package com.sapsf.hcm19.page.aprendizagem;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import org.openqa.selenium.Keys;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouAprendizagemAcao {
	
	ConnectYouAprendizagemTela connectYouAprendizagemTela = new ConnectYouAprendizagemTela(getDriver());
	
	public void selecionoOBotaoAprendizagem() {
		ComandosUteis.pausar(2000);
		connectYouAprendizagemTela.btnInicio.click();
		ComandosUteis.pausar(3000);
		connectYouAprendizagemTela.janelaPopUp.isDisplayed();
		connectYouAprendizagemTela.btnAprendizagem.click();
	}
	

	public void buscoCursoNoCampoProcurarAprendizagem(String cursoBusca) {
		connectYouAprendizagemTela.campoProcurarAprendizagem.sendKeys(cursoBusca);
		connectYouAprendizagemTela.campoProcurarAprendizagem.sendKeys(Keys.ENTER);
	}
	
}
