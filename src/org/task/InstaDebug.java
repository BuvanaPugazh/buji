package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaDebug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get ("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtUsername=driver.findElement(By.id("username"));
		txtUsername.sendKeys("Buvana");
		WebElement txtpassword=driver.findElement(By.name("password"));
		txtpassword.sendKeys("Buvi@24");
	

}
}