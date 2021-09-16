package com.sapsf.hcm19.page.login;

import com.sapsf.hcm19.core.setup.ComandosUteis;
import com.sapsf.hcm19.page.site.SiteNavegacao;

public class ConnectYouLoginAtividade {

	SiteNavegacao siteNavegacao = new SiteNavegacao();
	ConnectYouLoginAcao connectYouLoginAcao = new ConnectYouLoginAcao();

	public void preenchoOCampoUsuarioCom() {
		connectYouLoginAcao.clicarNoCampoUsuario();
		connectYouLoginAcao.limparCampoUsuario();
		connectYouLoginAcao.escreverCampoUsuario("massa_acessos", "usuario");
	}

	public void queEstouLogadoNoSiteConnectYou() {
		siteNavegacao.acessarSite("massa_site", "site_ConnectYou");
		connectYouLoginAcao.informoOIdDaEmpresaYaman("yamantecno");
		ComandosUteis.pausar(2000);
		preenchoOCampoUsuarioCom();
		connectYouLoginAcao.preenchoOCampoSenhaCom("massa_acessos", "senha");
	}

}
