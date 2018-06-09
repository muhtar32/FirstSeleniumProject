package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"/Users/muhtar/Documents/selenium dependencies/drivers/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.com");
}
}
