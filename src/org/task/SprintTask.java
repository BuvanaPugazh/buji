package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get ("https://www.t-mobile.com/devices/5g-phones");
		driver.manage().window().maximize();
		WebElement lnkPhone=driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkPhone).perform();
		WebElement lnkPhone5G =driver.findElement(By.xpath("//span[text()='5G Phones']"));
		lnkPhone5G.click();
		WebElement txtSale=driver.findElement(By.id("digital-footer-bottom-link-bottom-9"));
		String data=txtSale.getText();
		System.out.println(data);
		
		
	}
}
