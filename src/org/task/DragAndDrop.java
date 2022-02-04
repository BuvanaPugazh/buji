package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
		public static void main(String[] args){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get ("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			WebElement S=driver.findElement(By.id("credit2"));
			WebElement D=driver.findElement(By.id("bank"));
			Actions actions=new Actions(driver);
			actions.dragAndDrop(S,D).perform();
			WebElement S1=driver.findElement(By.id("fourth"));
			WebElement D1=driver.findElement(By.id("amt7"));
			actions.dragAndDrop(S1,D1).perform();
			WebElement S2=driver.findElement(By.id("credit1"));
			WebElement D2=driver.findElement(By.id("loan"));
			actions.dragAndDrop(S2,D2).perform();
			WebElement S3=driver.findElement(By.id("fourth"));
			WebElement D3=driver.findElement(By.id("amt8"));
			actions.dragAndDrop(S3,D3).perform();
			WebElement txtPerfect=driver.findElement(By.xpath("//a[contains(text(),'Perfect')]"));
			String data=txtPerfect.getText();
			System.out.println(data);
			
		    
	

			

}
}