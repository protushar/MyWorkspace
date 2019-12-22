package jobs.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HousingmanTest {
	WebDriver driver;
	@BeforeTest
	public void ToTestBeforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="tushar.kr0412";
		data[0][1]="babulkumar";
		
		// 2nd row
		data[1][0] ="tushar.tsr007";
		data[1][1] = "babulkumar";
		
		// 3rd row
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";

		return data;

	}
@Test(dataProvider="getData")
public void Test(String username, String password) throws InterruptedException
{
	System.out.println("username is"+username);
	System.out.println("password is"+password);
driver.findElement(By.xpath("//input")).sendKeys(username);
driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
Thread.sleep(5000);
driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

}

}
