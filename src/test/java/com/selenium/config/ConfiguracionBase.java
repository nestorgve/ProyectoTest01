package com.selenium.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ConfiguracionBase {
	public WebDriver driver;

	  @BeforeMethod()
	  public void getDriver() {
	    System.setProperty("webdriver.chrome.driver", "../exampleSelenium/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    //
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://www.sodimac.cl/sodimac-cl/");
	    //
	    System.out.println("Successfully opened the website https://www.sodimac.cl/sodimac-cl/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //limita el tiempo
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicito el tiempo de ejecución
	  }

	  @AfterMethod()
	  public void teardownTest() {
	    // Close browser and end the session
	    driver.quit();
	  }
}
