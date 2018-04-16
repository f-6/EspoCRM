package com.espoCRM.utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Config.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			default:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		return driver;
	}

	public static void quit() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static void quit(int seconds) {
		if (driver != null) {
			sleep(seconds);
			driver.quit();
			driver = null;
		}
	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}
	
/* THESE methods are GenerateData methods. Basicaly, it's Generating random data for your needs */
		
	//Random STRING
		public static String generateRandomString(int length){
		  return RandomStringUtils.randomAlphabetic(length);
		 }
		 
	//Random NUMBER
		 public static String generateRandomNumber(int length){
		  return RandomStringUtils.randomNumeric(length);
		 }
		 
	//Random AlPHA NUMERIC
		 public static String generateRandomAlphaNumeric(int length){
		  return RandomStringUtils.randomAlphanumeric(length);
		 }
		 
	//Random AllOWED SPECIAL CHARACTERS
		 public static String generateStringWithAllowedSplChars(int length,String allowdSplChrs){
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    allowdSplChrs;
		  return RandomStringUtils.random(length, allowedChars);
		 }
	
	//Random GENERATE EMAIL
		 public static String generateEmail(int length) {
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    "_-.";   //special characters
		  String email="";
		  String temp=RandomStringUtils.random(length,allowedChars);
		  email=temp.substring(0,temp.length()-9)+"@test.org";
		  return email;
		 }
		 
	//Random GENERATE EMAIL
		 public static String generateNegativeEmail(int length) {
		  String allowedChars= //"abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    "_-.";   //special characters
		  String email="";
		  String temp = RandomStringUtils.random(length,allowedChars);
		  email=temp.substring(0,temp.length()-9)+"@test.org";
		  return email;
		 }
	
	//RAndom GENERATE URL
		 public static String generateUrl(int length) {
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    "_-.";   //special characters
		  String url="";
		  String temp=RandomStringUtils.random(length,allowedChars);
		  url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
		  return url;
		 }
		
	

}
