package com.sapsf.hcm19.page.perfil;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import org.junit.jupiter.api.Assertions;

import com.sapsf.hcm19.core.setup.ComandosUteis;

public class ConnectYouPerfilVerificar {

    ConnectYouPerfilTela connectYouPerfilTela = new ConnectYouPerfilTela(getDriver());

    public void validoOsDadosNomeEmpresaEMailCorporativoNaTela(String nome, String empresa, String email) {
        ComandosUteis.pausar(3000);
    	Assertions.assertEquals(nome, connectYouPerfilTela.txtNomeCompleto.getText());
        Assertions.assertEquals(empresa, connectYouPerfilTela.txtEmpresa.getText());
        Assertions.assertEquals(email, connectYouPerfilTela.txtEmail.getText());

    }
}