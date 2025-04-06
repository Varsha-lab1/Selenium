package Day1;
/*
Open page
Type username student into Username field
Type password incorrectPassword into Password field
Push Submit button
Verify error message is displayed
Verify error message text is Your password is invalid!

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("skfj");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.id("error")).getText();
		System.out.println(msg);
		

	}

}
