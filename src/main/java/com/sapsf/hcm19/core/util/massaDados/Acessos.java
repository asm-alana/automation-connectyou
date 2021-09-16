package com.sapsf.hcm19.core.util.massaDados;

import com.sapsf.hcm19.core.util.leitorJson.MassaDadosLeitor;

public class Acessos {

    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Acessos(String json_file, String id_massa) {
        this.usuario = MassaDadosLeitor.PesquisaDados(json_file, id_massa, "usuario");
        this.senha = MassaDadosLeitor.PesquisaDados(json_file, id_massa, "senha");
    }


}
