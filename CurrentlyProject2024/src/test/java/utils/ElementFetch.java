package utils;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import tests.BaseClass;

public class ElementFetch {

	public MobileElement getWebElement(String identifierType,String identifierValue) {
		switch(identifierType) {
		case "ID":
			return BaseClass.driver.findElement(By.id(identifierValue));
		case "CSS":
			return BaseClass.driver.findElement(By.cssSelector(identifierValue));
		case "TAGNAME":
			return BaseClass.driver.findElement(By.tagName(identifierValue));
		case "XPATH":
			return BaseClass.driver.findElement(By.xpath(identifierValue));
		case "NAME":
			return BaseClass.driver.findElement(By.name(identifierValue));	
			default:
				return null;
		}
	}
}
