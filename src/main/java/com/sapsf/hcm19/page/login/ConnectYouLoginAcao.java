package com.sapsf.hcm19.page.login;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import com.sapsf.hcm19.core.setup.ComandosUteis;
import com.sapsf.hcm19.core.util.massaDados.Acessos;
import org.openqa.selenium.Keys;

public class ConnectYouLoginAcao {

	ConnectYouLoginTela connectYouLoginTela = new ConnectYouLoginTela(getDriver());

	public void clicarNoCampoUsuario() {
		
		if (connectYouLoginTela.campoUsuarioLogin.isEnabled()) {
			connectYouLoginTela.campoUsuarioLogin.click();
		}else {
			ComandosUteis.pausar(1500);
			connectYouLoginTela.campoUsuarioLogin.click();
		}
	}
	
	public void limparCampoUsuario() {
		connectYouLoginTela.campoUsuarioLogin.clear();
	}
	
	public void escreverCampoUsuario(String file_json, String id_massa) {
		Acessos acessos = new Acessos(file_json, id_massa);

		connectYouLoginTela.campoUsuarioLogin.sendKeys(acessos.getUsuario());
	}

	public void informoOIdDaEmpresaYaman(String idEmpresa) {
		connectYouLoginTela.campoIdEmpresa.sendKeys(idEmpresa);
		connectYouLoginTela.btnProsseguirIdEmpresa.click();
	}

	public void preenchoOCampoSenhaCom(String json_file, String id_massa) {
		Acessos acessos = new Acessos(json_file, id_massa);

		connectYouLoginTela.campoSenhaLogin.sendKeys(acessos.getSenha());
		connectYouLoginTela.campoSenhaLogin.sendKeys(Keys.ENTER);
	}
	
}

