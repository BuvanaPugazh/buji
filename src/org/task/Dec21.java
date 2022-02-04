package org.task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec21 {
	public class MoneyControl {
		public void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get ("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement lnkCondition=driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(true)",lnkCondition);
			WebElement element=driver.findElement(By.xpath("//h2[text()='Today’s Deals'"));
			executor.executeScript("arguments[0].scrollIntoView(false)",element);
			
			
			


}
	}
}