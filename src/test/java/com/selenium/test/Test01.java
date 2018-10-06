package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {
	@Test
	public void exampleTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../exampleSelenium/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.falabella.com/falabella-cl/");
		WebElement inicio = driver.findElement(By.xpath("(//*[@class='fb-masthead-login__user-info__logged'])"));
		inicio.click();
		WebElement inicio_sesion = driver.findElement(By.xpath("(//*[@class='fb-btn fb-btn-primary'])"));
		inicio_sesion.click();
		WebElement usuario = driver.findElement(By.id("inputEmail"));
		usuario.sendKeys("luisabocache81@gmail.com");
		WebElement clave = driver.findElement(By.id("loginPassword"));
		clave.sendKeys("Luisab1613");
		WebElement ingresar = driver.findElement(By.id("loginClick"));
		ingresar.click();
		WebElement buscar_un_sku = driver.findElement(By.name("Ntt"));
		buscar_un_sku.sendKeys("3441681");
		buscar_un_sku.submit();
		WebElement agregar_a_bolsa = driver.findElement(By.xpath("(//*[@class='fb-btn fb-btn-primary fb-product-cta__controls--actions--choose full-width-btn'])"));
		agregar_a_bolsa.click();
		Thread.sleep(5000);
		WebElement ver_bolsa = driver.findElement(By.xpath("(//*[@class='fb-btn fb-btn-primary fb-added-to-basket__cta fb-added-to-basket__cta--basket'])[2]"));
		ver_bolsa.click();
		WebElement agregar_uno_mas = driver.findElement(By.xpath("(//*[@class='fb-quantity-input__plus'])"));
		agregar_uno_mas.click();
		
		
		
		
		
		
		//WebElement bolsa = driver.findElement(By.xpath("(//*[@class='fb-masthead-basket__icon icon-bag-green'])"));
		//bolsa.click();
	}
}