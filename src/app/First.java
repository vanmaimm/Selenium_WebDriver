package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	         
		  driver.get("https://www.linkedin.com/");
		  
		  WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		  signIn.click();
		  
		  WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		  username.sendKeys("miancloud@gmail.com");
		  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		  
		  WebElement logIn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	
		  password.sendKeys("mian@123");
		  logIn.click();
		  
		  String expected = "Feed | LinkedIn";
		  String actual = driver.gettitle();

		 if (actual.contentEquals(expected)){
			 System.out.println("Test Passed!");
		 } else {
			 System.out.println("Test Failed");
		 }
}
