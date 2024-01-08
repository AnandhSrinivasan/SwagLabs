package com.PageObjModel_cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	private static Homepage HomepageInstance;
	private Homepage() {
	}
	public static Homepage getInstance() {
		if (HomepageInstance==null) {
			HomepageInstance = new Homepage();
		}
		return HomepageInstance;
	}
	
	@FindBy(xpath = "(//span[@class='title'])[1]")
	private WebElement ProductPage;
	
	public void clickHomepage() {
		ProductPage.getText().contentEquals("Product");
	}

//Using Getter and Setter Method
//	public  WebElement getProductPage() {
//		return ProductPage;
//	}
	
	
}
