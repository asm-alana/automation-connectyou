package com.sapsf.hcm19.steps.perfil;

import com.sapsf.hcm19.page.perfil.ConnectYouPerfilVerificar;

import io.cucumber.java.pt.Entao;

public class PerfilStepsVerificar {

    ConnectYouPerfilVerificar connectYouPerfilVerificar = new ConnectYouPerfilVerificar();

    @Entao("valido os dados nome {string}, empresa {string}, e-mail corporativo {string} na tela")
    public void validoOsDadosNomeEmpresaEMailCorporativoNaTela(String nome, String empresa, String email) {
        connectYouPerfilVerificar.validoOsDadosNomeEmpresaEMailCorporativoNaTela(nome, empresa, email);
    }
}