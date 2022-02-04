package org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	WebDriver driver;
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
		
	}
	public String getText(WebElement element) {
		String data = element.getText();
		return data;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String getCurrentUrl() {
		String data = driver.getCurrentUrl();
		return data;
	}
	public String getAttributeValue(WebElement element) {
		String data=element.getAttribute("value");
		return data;
	}
	public void close() {
		driver.close();
	}
	public void quit() {
	    driver.quit();
	}
	public void accept() {
      Alert alert = driver.switchTo().alert();
      alert.accept();
	}
	public void dismiss() {
	      Alert alert = driver.switchTo().alert();
	      alert.dismiss();
	}
	public void textbox(String text) {
	      Alert alert = driver.switchTo().alert();
	      alert.sendKeys(text);
	}
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	public void forword() {
		driver.navigate().forward();
	}
	public void back() {
		driver.navigate().back();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void moveToElement(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	public void dragAndDrop(WebElement element){
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element,element);
	}
	public void contextClick(WebElement element){
		Actions actions = new Actions(driver);
		actions.contextClick(element);
	
	}
	public void doubleClick(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}
	private void setAttributeInJs(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].setAttribute('value','"+data+"')", element);
	}
	private void clickInJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].click()", element);
	}
	private void getAttributeInJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("return argument[0].getAttribute('value')", element);
	
	}
	private void scrollDown(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].scrollIntoView(true)", element);
	
	}
	private void scrollUp(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].scrollIntoView(true)", element);
	
	
	
	
	
	
	
	
	
	}
	

}
