package com.sapsf.hcm19.core.util.utilidades;

import java.io.File;
import java.util.Arrays;

public class Gerais {
	
	public static void excluirTodosArquivos(String caminho) {
					
			File file = new File(caminho);
			if (file.listFiles().length > 0) {
				Arrays.stream(file.listFiles()).forEach(File::delete);
			}
	}
}
