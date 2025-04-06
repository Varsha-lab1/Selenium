package Day1;
//tetstscript to copy paste username text into password field

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys("student");
		Thread.sleep(2000);
		System.out.println(Keys.CONTROL+"a");
		Thread.sleep(2000);
		System.out.println(Keys.CONTROL+"c");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();

	}

}
