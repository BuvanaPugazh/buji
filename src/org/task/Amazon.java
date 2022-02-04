package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumDay3\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch=driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("new iphone");
		WebElement btnLogin=driver.findElement(By.id("nav-search-submit-button"));
		btnLogin.click();
		
		
		
	}

}
