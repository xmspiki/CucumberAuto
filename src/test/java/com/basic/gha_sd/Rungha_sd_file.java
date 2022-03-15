package com.basic.gha_sd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome = true,
	features = { "src/test/resources/com//basic/gha_ff" },
	glue = { "com/basic/gha_sd" },
	plugin = { "pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json" }
	)

public class Rungha_sd_file {

}
