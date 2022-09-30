package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\karan\\eclipse-workspace\\Selenium Sample\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	driver.manage().window().maximize();
	

}
}
