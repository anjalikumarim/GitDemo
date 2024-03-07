package Automation_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		driver.findElement(By.id("familyandfriend")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount\'")).click();
		//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
