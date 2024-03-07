package Automation_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver.get("https://expire.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
