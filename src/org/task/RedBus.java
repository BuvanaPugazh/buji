package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumDay3\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement txtFrom=driver.findElement(By.xpath("//input[@id='src']"));
	txtFrom.sendKeys("Chennai");
	WebElement txtTo=driver.findElement(By.xpath("//input[@id='dest']"));
	txtTo .sendKeys("Trichy");
	WebElement btnDate=driver.findElement(By.xpath("//input[@class='db'][1]"));
	btnDate.click();
	WebElement btnSearch=driver.findElement(By.xpath("//button[@id='search_btn']"));
	btnSearch.click();
	
	}


}
