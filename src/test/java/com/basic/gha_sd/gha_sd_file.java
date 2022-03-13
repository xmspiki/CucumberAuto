package com.basic.gha_sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gha_sd_file {
	WebDriver driver = null;

	@Given("^Open page in browser$")
	public void open_page_in_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//spiki//Development//test//Webdriver//chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.morris-on.hu");
	}

	@When("^See the testimonials$")
	public void see_the_testimonials() throws Throwable {
		driver.findElement(By.xpath("//a[@href=\"#velemenyek\"]")).click();
	    System.out.println("Vélemények");
	}

	@Then("^See the prices$")
	public void see_the_prices() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href=\"#arak\"]")).click();
	    System.out.println("Árak");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		Thread.sleep(5000);
	    driver.quit();
	    driver = null;
	}

}
