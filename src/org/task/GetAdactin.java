package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAdactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumDay3\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtFacebook=driver.findElement(By.xpath("//p[contains(text(),'A')]"));
		String data=txtFacebook.getText();
		System.out.println(data);
		}


}
