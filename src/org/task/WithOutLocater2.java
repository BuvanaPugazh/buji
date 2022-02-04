package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutLocater2 {public static void main(String[] args) throws AWTException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishva\\Desktop\\test\\SeleniumTest\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get ("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	Robot robot=new Robot();
	for(int i=1;i<=3;i++) {
    robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	}
	robot.keyPress(KeyEvent.VK_SHIFT);
	//BUVI
	robot.keyPress(KeyEvent.VK_B);
	robot.keyRelease(KeyEvent.VK_B);
	robot.keyPress(KeyEvent.VK_U);
	robot.keyRelease(KeyEvent.VK_U);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	//tab
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_SHIFT);
	//KRP
	robot.keyPress(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_K);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	for(int i=1;i<=2;i++) {
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}

}
