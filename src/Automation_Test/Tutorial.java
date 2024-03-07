package Automation_Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] itemsNeeded = {"Cucumber", "Beetroot", "Brocolli", "Mushroom"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
//		Tutorial b= new Tutorial();
//		b.addItems(driver, itemsNeeded);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	public static  void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j = 0;
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<Products.size();i++)
		{
			String[] name = Products.get(i).getText().split("-");
			String formattedName = name [0].trim();
			
			//convert array into array list for easy search
			//check whether name you extracted is present in array list or not-
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
				 
			{
				j++;
				 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				 
				if(j==itemsNeeded.length)
				 {
					 break;
				 }
				
			}
		}

	}

}
