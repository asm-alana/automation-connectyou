package br.com.ahgora.core.setup;

import static br.com.ahgora.core.setup.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComandosUteis {
	

	public static WebElement aguardaElementoParaClique(WebElement elemento) {
		new WebDriverWait(getDriver(), 30).until(ExpectedConditions.elementToBeClickable(elemento));
		return elemento;
	}

	public static WebElement aguardaElementoParaSelecionar(WebElement elemento) {
		new WebDriverWait(getDriver(), 30).until(ExpectedConditions.visibilityOfAllElements(elemento));
		return elemento;
	}
	
	public static WebElement esperaElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait((WebDriver) elemento, 5);
		wait.until(ExpectedConditions.visibilityOf(elemento));
		return elemento;
		
	}
	
	
	public static void clicaEAguarda(WebElement elemento) {
		elemento.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
	public static void AguardaElemento(WebElement elemento) {
		elemento.equals(elemento);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
	
	
	public static void escreveEVerificarTexto(WebElement elemento, String conteudoTexto) {
		elemento.sendKeys(conteudoTexto);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(elemento.getText().equals(conteudoTexto)) {
			return;
		}else {
			new RuntimeException("Não conseguiu escrever o texto");
		} 
	}
	
	public static void testeAguarde (WebElement elemento) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(),7);
        wait.until(ExpectedConditions.visibilityOf(elemento));
 
           try {
            Thread.sleep(4000);
            if (elemento.isDisplayed()) {
                
            } else {
            	Thread.sleep(4000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	public static void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
	
	public static void pausar(int tempoMs) {
		try {
			Thread.sleep(tempoMs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//	public static void selecionarCombo(By elemento, String valor) {
//		try {
//			WebElement webElement = DriverWeb.getDriver().findElement(elemento);
//			Select combo = new Select(webElement);
//			int limite = 0;
//			List<String> opções;
//			boolean resultado = false;
//			int index = 0;
//			do {
//				combo = new Select(webElement);
//				limite++;
//				esperarMilisegundos(100);
//				opções = obterTextosCombo(elemento, "");
//				List<String> opçõesFormatado = new ArrayList<String>();
//
//				for (String string : opções) {
//					opçõesFormatado.add(string.toLowerCase().trim());
//				}
//
//				if (opçõesFormatado.stream().anyMatch(valor.toLowerCase().trim()::contains)) {
//					index = opçõesFormatado.indexOf(valor.toLowerCase().trim());
//					break;
//				}
//
//			} while (!resultado && limite < TIMEOUT * 10);
//			try {
//				combo.selectByIndex(index);
//			} catch (WebDriverException e) {
//				selecionarCombo(elemento, valor);
//			}
//
//		} catch (ElementNotVisibleException e) {
//			System.out.println(" -- ERRO: elemento: '" + elemento + "' NAO esta visivel na plataforma: '");
//		}
//	}
	
	public static void moveToElement(WebElement elemento) {
		Actions actionProvider = new Actions(getDriver());
		try {
			actionProvider.moveToElement(elemento);
		} catch (Exception e) {
			System.out.println("Nao foi possivel mover o mouse para o elemento");
		}
		
		
		}
	
}
