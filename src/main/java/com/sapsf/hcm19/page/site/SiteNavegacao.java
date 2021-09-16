package com.sapsf.hcm19.page.site;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import com.sapsf.hcm19.core.util.massaDados.SiteDados;

public class SiteNavegacao {
	
	public void acessarSite(String json_file, String id_massa) {
		
		SiteDados siteDados = new SiteDados(json_file, id_massa);
		getDriver().get(siteDados.getSite());
		
	}
	
}
