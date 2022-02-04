package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumDay3\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement txtmobilenumber=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	txtmobilenumber.sendKeys("7554435678");
	WebElement btnlogin=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	btnlogin.click();


}
}
