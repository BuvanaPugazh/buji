package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec22Adactin{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get ("http://adactinhotelapp.com");
			driver.manage().window().maximize();
			WebElement txtUserName= driver.findElement(By.id("username"));
			txtUserName.sendKeys("SheebaBuvana");
			WebElement txtPassword= driver.findElement(By.id("password"));
			txtPassword.sendKeys("Sheeba@24");
			WebElement btnLogin= driver.findElement(By.id("login"));
			btnLogin.click();
			WebElement btnLocation= driver.findElement(By.id("location"));
			Select select=new Select(btnLocation);
			select.selectByIndex(5);
			WebElement btnHotel= driver.findElement(By.id("hotels"));
			Select select1=new Select(btnHotel);
			select1.selectByIndex(3);
			WebElement btnRoom= driver.findElement(By.id("room_type"));
			Select select2=new Select(btnRoom);
			select2.selectByIndex(2);
			WebElement btnSearch= driver.findElement(By.id("Submit"));
			btnSearch.click();
			WebElement btnRadiobutton= driver.findElement(By.id("radiobutton_0"));
			btnRadiobutton.click();
			WebElement btnContinue= driver.findElement(By.id("continue"));
			btnContinue.click();
			WebElement txtFirstName= driver.findElement(By.id("first_name"));
			txtFirstName.sendKeys("Vishnu");
			WebElement txtLastName= driver.findElement(By.id("last_name"));
			txtLastName.sendKeys("Kumar");
			WebElement txtAddress= driver.findElement(By.id("address"));
			txtAddress.sendKeys("OMR,Chennai");
			WebElement txtCardNum= driver.findElement(By.id("cc_num"));
			txtCardNum.sendKeys("2345678913121226");
			WebElement btnCardType= driver.findElement(By.id("cc_type"));
			Select select4=new Select(btnCardType);
			select4.selectByIndex(2);
			WebElement btnMonth= driver.findElement(By.id("cc_exp_month"));
			Select select5=new Select(btnMonth);
			select5.selectByIndex(5);
			WebElement btnYear= driver.findElement(By.id("cc_exp_year"));
			Select select6=new Select(btnYear);
			select6.selectByIndex(2);
			WebElement txtNum= driver.findElement(By.id("cc_cvv"));
			txtNum.sendKeys("2443");
			WebElement btnBook= driver.findElement(By.id("book_now"));
		    btnBook.click();
		    Thread.sleep(9000);
		    WebElement orderno = driver.findElement(By.name("order_no"));
		    String data = orderno.getAttribute("value");
		    System.out.println(data);
		    			
			
}
}