package com.PageObjModel_cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	@FindBy(xpath = "(//span[@class='title'])[1]")
	public static WebElement ProductPage;
	
}
