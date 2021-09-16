package com.sapsf.hcm19.steps.home;

import com.sapsf.hcm19.page.home.ConnectYouHomeAcao;

import io.cucumber.java.pt.Quando;

public class HomeStepsAcao {

	ConnectYouHomeAcao connectYouHomeAcao = new ConnectYouHomeAcao();
	
	@Quando("seleciono o menu Feedback Continuo")
	public void selecionoOMenuFeedbackContinuo() {
		connectYouHomeAcao.selecionoOMenuFeedbackContinuo();
	}

	@Quando("clico no botao Connect You")
	public void clicoNoBotaoConnectYou() {
	    connectYouHomeAcao.clicoNoBotaoConnectYou();
	}
}
