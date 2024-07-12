package session6_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program6_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ops-qa.4onprintshop.com/admin/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin095");
		driver.findElement(By.name("login")).click();
		
		driver.close();
	
		}

}
