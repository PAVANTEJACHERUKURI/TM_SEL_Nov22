package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRM_Login {
 @Test
 public void Login_HRM(){
	 System.setProperty("webdriver.chrome.driver","‪chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver(); 
	 driver.get("http://testingmasters.com/hrm");
 }
	
}
