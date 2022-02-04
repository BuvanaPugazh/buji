package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumDay3\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName=driver.findElement(By.xpath("//input[@id='email']"));
	txtUserName.sendKeys("Buvipuppy@24");
	WebElement txtPassword=driver.findElement(By.xpath("//input[@name='pass']"));
	txtPassword .sendKeys("9842889677");
	WebElement btnlogin=driver.findElement(By.xpath("//button[@name='login']"));
	btnlogin.click();
		
	}

}
