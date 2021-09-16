package com.sapsf.hcm19.steps.login;

import com.sapsf.hcm19.page.login.ConnectYouLoginAcao;
import com.sapsf.hcm19.page.login.ConnectYouLoginAtividade;

import io.cucumber.java.pt.Quando;

public class LoginStepsAcao {

	ConnectYouLoginAtividade connectYouLoginAtividade = new ConnectYouLoginAtividade();
	ConnectYouLoginAcao connectYouLoginAcao = new ConnectYouLoginAcao();
	
	@Quando("informo o Id {string} da empresa Yaman")
	public void informoOIdDaEmpresaYaman(String idEmpresa) {
	    connectYouLoginAcao.informoOIdDaEmpresaYaman(idEmpresa);
	}
	
	@Quando("preencho o campo Usuario com {string}")
	public void preenchoOCampoUsuarioCom(String usuario) {
		connectYouLoginAtividade.preenchoOCampoUsuarioCom();
	}
	
	@Quando("preencho o campo Senha com {string}")
	public void preenchoOCampoSenhaCom(String senha) {
		connectYouLoginAcao.preenchoOCampoSenhaCom("massa_acessos", senha);
	}
}
