package com.module.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeClass
	public void BrowserConfig()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver_win32 (4)\\chromedriver.exe");
driver=new ChromeDriver();
	}
	WebDriver driver;
	String BillsPath="//img[@alt='Bills']/parent::div[@class='a-section a-spacing-none fluid-image-container']";
	public void WaitTillPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginTest()
	{
		WaitTillPageLoad();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath(BillsPath)).click();
	}
	@Test(dependsOnMethods={"LoginTest"})
	public void MomeTest()
	{
		WaitTillPageLoad();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.history.go(-1)");
	}
}
