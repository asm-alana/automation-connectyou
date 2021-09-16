package com.sapsf.hcm19.hooks;

import com.sapsf.hcm19.core.setup.DriverFactory;
import com.sapsf.hcm19.core.util.utilidades.EvidenciasTela;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HookAfter {

	@After
	public void finalizar(Scenario cenario) {
		String nomeDoCenario = cenario.getName();
		if (cenario.isFailed()) {
			EvidenciasTela.tirarScreenshotWeb(nomeDoCenario, "nomeDoStep");
		}
		DriverFactory.killDriver();
		
	}
	
}
