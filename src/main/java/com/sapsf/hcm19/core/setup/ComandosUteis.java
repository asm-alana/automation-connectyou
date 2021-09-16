package com.sapsf.hcm19.core.setup;

import static com.sapsf.hcm19.core.setup.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

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

	public static List<String> obterValoresCombo(String id) {
		WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for(WebElement opcao: allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}

	public static void moveToElement(WebElement elemento) {
		Actions actionProvider = new Actions(getDriver());
		try {
			actionProvider.moveToElement(elemento).click();

		} catch (Exception e) {
			System.out.println("Nao foi possivel mover o mouse para o elemento");
		}
		
		
		}

	public static void mouseOn(By id) {
		WebElement el = getDriver().findElement(id);
		Actions action = new Actions(getDriver());
		action.moveToElement(el).build().perform();
	}
	
}
