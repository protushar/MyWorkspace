package com.module.ActiLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeTest {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver_win32 (4)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.get("http://localhost/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("keepLoggedInCheckBox")).click();
driver.findElement(By.id("loginButton")).click();
String actstring="actiTIME - Enter Time-Track";
String expectstring=driver.getTitle();
System.out.println(expectstring);
if(expectstring.equals(actstring))
{
	System.out.println("Pass");
}
else
{
	System.out.println("fail");
}
	}

}
