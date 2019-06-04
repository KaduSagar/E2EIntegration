package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void testcase1()
	{
		System.setProperty("www.chrome.driver", "./Driver/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.thetestingworld.com/");
		driver.findElement(By.xpath("//*[@id=\"ja-search\"]/ul/li[1]/a")).click();
		driver.findElement(By.id("username")).sendKeys("Sagar");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"ja-content-main\"]/div/div/form/fieldset/button")).click();
		driver.quit();
	}
}
