package com.sapsf.hcm19.core.util.leitorJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.sapsf.hcm19.core.setup.VariavelGlobal;

public class MassaDadosLeitor {

	public static String PesquisaDados(String json_file, String id_massa, String identificador) {
		VariavelGlobal.massaDados = json_file;
		VariavelGlobal.identificadorMassa = id_massa;
		

		JSONParser Jparser = new JSONParser();
		JSONObject JObj = new JSONObject();
		
		try {
			String diretorio = System.getProperty("user.dir");
			JObj = (JSONObject) Jparser.parse(
					new FileReader(diretorio + "/src/main/resources/json_file/" + VariavelGlobal.massaDados + ".json"));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		JSONObject jObject = (JSONObject) JObj.get(id_massa);
		String retornoDados = (String) jObject.get(identificador);
		return retornoDados;
	}
}
