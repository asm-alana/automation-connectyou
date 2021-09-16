package com.sapsf.hcm19.steps.site;

import com.sapsf.hcm19.page.login.ConnectYouLoginAcao;
import com.sapsf.hcm19.page.login.ConnectYouLoginAtividade;
import com.sapsf.hcm19.page.site.SiteNavegacao;
import com.sapsf.hcm19.steps.login.LoginStepsAcao;

import io.cucumber.java.pt.Dado;

public class SiteConnectYouSteps {
	
	SiteNavegacao siteNavegacao = new SiteNavegacao();
	
	LoginStepsAcao loginStepsAcao = new LoginStepsAcao();
	ConnectYouLoginAtividade connectYouLoginAtividade = new ConnectYouLoginAtividade();
	ConnectYouLoginAcao connectYouLoginAcao = new ConnectYouLoginAcao();
	
	@Dado("que estou no site Connect You")
	public void queEstouNoSiteConnectYou() {
		siteNavegacao.acessarSite("massa_site", "site_ConnectYou");
	}
	
	@Dado("que estou logado no site Connect You")
	public void queEstouLogadoNoSiteConnectYou() {
		connectYouLoginAtividade.queEstouLogadoNoSiteConnectYou();
	}
}
