package com.sapsf.hcm19.core.setup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	protected static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null) {
			switch (Propriedades.browser) {
				case FIREFOX:
					FirefoxOptions options = new FirefoxOptions();
					options.addArguments("--disable-notifications");
//				options.addArguments("--headless");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					JavascriptExecutor jseFirefox = (JavascriptExecutor)driver;
					jseFirefox.executeScript("scrollBy(0,300)", "");
					break;
				case CHROME:
					ChromeOptions option = new ChromeOptions();
					option.addArguments("--disable-notifications");
					driver = new ChromeDriver(option);
					driver.manage().window().maximize();
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("scrollBy(0,300)", "");
					break;
				case HEADLESS:
					ChromeOptions optionHEADLESS = new ChromeOptions();
					optionHEADLESS.addArguments("--disable-notifications"); //desabilita notificacoes do navegador
					optionHEADLESS.addArguments("--headless"); //faz com que a execuçao do teste seja realizada em modo invisivel
					driver = new ChromeDriver(optionHEADLESS);
					driver.manage().window().maximize();
					JavascriptExecutor jseHEADLESS = (JavascriptExecutor)driver;
					jseHEADLESS.executeScript("scrollBy(0,300)", "");
					break;
			}
		}
		return driver;
	}
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}