package Automation_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement DateOfBirth = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(DateOfBirth)).click();
		
		WebElement IceCreams = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(IceCreams)).click();
		
		WebElement radioButton = driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
	}

}
