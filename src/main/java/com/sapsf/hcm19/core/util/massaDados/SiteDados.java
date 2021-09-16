package com.sapsf.hcm19.core.util.massaDados;

import com.sapsf.hcm19.core.util.leitorJson.MassaDadosLeitor;

public class SiteDados {
	private String site;

	public String getSite() {
		return site;
	}
	
	public SiteDados(String json_file, String id_massa){
		this.site = MassaDadosLeitor.PesquisaDados(json_file, id_massa, "site");
	}
	
}
