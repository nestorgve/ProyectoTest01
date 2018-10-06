package com.selenium.test;

import org.testng.annotations.Test;
import com.selenium.config.ConfiguracionBase;
import com.selenium.page.CartPage;
import com.selenium.page.HomePage;
import com.selenium.page.PDPPage;

public class Test02_EjemploPage extends ConfiguracionBase {

	@Test
	public void example02() {
		HomePage homePage = new HomePage(driver); //instanciando nuestro metodo homepage
		//homePage.searchProduct();
		PDPPage pdpPage = homePage.searchProduct();
		pdpPage.clickAddToCart();
		CartPage cartPage = pdpPage.clickGoToCart();
		cartPage.validCartItem();
	}
}
