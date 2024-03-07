package Automation_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.id("form-field-travel_from")).sendKeys("dhanbad");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day "));
		int count = driver.findElements(By.className("flatpickr-day ")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if (text.equalsIgnoreCase("15"))
				
			{
				driver.findElements(By.className("flatpickr-day ")).size();
				break;
			}

		}
	}
}
