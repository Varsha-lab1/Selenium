package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		String url="https://practicetestautomation.com/logged-in-successfully/";
		String expectedurl=driver.getCurrentUrl();
		if(url.equals(expectedurl))
		{
			System.out.println("Successfully login");
		}
		else
		{
			System.out.println("not login");
		}
		driver.findElement(By.linkText("Log out")).click();
	}

}
