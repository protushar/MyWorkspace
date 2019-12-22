package com.module.ActiUsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateUsers {

	public static void main(String[] args) throws InterruptedException{
		
//Login to account
		//System.setProperty("webdriver.gecko.driver", "G:\\Selenium\\Drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
//CLICK ON USERS BUTTON ON TOP
		Thread.sleep(6000);
		driver.findElement(By.xpath("//table[@id='topnav']/tbody/tr/td[5]/a/div[@class='img']")).click();
		driver.findElement(By.xpath("//tbody/tr[@id='pageHeader']/td[2]/div[@id='createUserDiv']")).click();
//enter the details
		driver.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField']")).sendKeys("biku");
		driver.findElement(By.xpath("//input[@id='userDataLightBox_lastNameField']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='userDataLightBox_emailField']")).sendKeys("usr.kr@gmail.com");
        driver.findElement(By.xpath("//input[@id='userDataLightBox_usernameField']")).sendKeys("shak");
        driver.findElement(By.xpath("//input[@id='userDataLightBox_passwordField']")).sendKeys("shak");
        driver.findElement(By.xpath("//input[@id='userDataLightBox_passwordCopyField']")).sendKeys("shak");
        
//click and create user
        String Script = "javascript:document.getElementById('userDataLightBox_commitBtn').click();";
        ((JavascriptExecutor) driver).executeScript(Script);
             
        System.out.println("new user created");
   
//select all the employee and view the records
        List <WebElement> lst=driver.findElements(By.xpath("//table[@class='userNameContainer']/tbody/tr/td/div[@class='name']"));
        System.out.println(lst.size());
        for(int i=0;i<=lst.size();i++)
        {
        	String users=lst.get(i).getText();
        System.out.println(users);
        }
	}

}
