package com.sapsf.hcm19.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.sapsf.hcm19.core.setup.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", 
		glue = {""},
		tags = "@regressivo",
		plugin = {"json:src/test/resources/evidencias/relatorio/json/report.json","html:src/test/resources/evidencias/relatorio/html/report.html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		)
		
public class CucumberRunner {
		
	@AfterClass
	public static void finalizarRunner() {
		DriverFactory.killDriver();
	}
}
