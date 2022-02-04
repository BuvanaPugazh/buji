package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement btnCreateNewAcct=driver.findElement(By.xpath("//a[text( )='Create New Account']"));
		btnCreateNewAcct.click();
		WebElement txtFirstName=driver.findElement(By.name("firstName"));
		txtFirstName.sendKeys("Buvana");
		
	}

}
