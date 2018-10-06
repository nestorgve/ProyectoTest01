package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.ConfiguracionBase;

public class PDPPage extends ConfiguracionBase {

	public PDPPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// creamos los Elementos
	@FindBy(xpath = "(//*[@class='pull-left btn-red btn-addToCart col-md-4 paddingHReset'])")
	private WebElement addToCartBtn;

	@FindBy(xpath = "(//*[@class='btn-addToCart col-xs-12 col-md-3 pull-right btn-red'])")
	private WebElement goToCartBtn;

	// creamos nuestro metodo agregar al carro
	public void clickAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(addToCartBtn));
		addToCartBtn.click();
	}

	// creamos nuestro metodo ir al carro
	public CartPage clickGoToCart() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(goToCartBtn));
		action.moveToElement(goToCartBtn).click().perform();
		return new CartPage(driver);
	}
}
