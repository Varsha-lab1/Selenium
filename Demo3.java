package Day1;
/*Negative test cases
Open page
Type username incorrectUser into Username field
Type password Password123 into Password field
Push Submit button
Verify error message is displayed
Verify error message text is Your username is invalid!
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys("student");
		Thread.sleep(2000);
		un.clear();
		un.sendKeys("studentdkjf");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		WebElement un1=driver.findElement(By.id("error"));
		String msg=un1.getText();
		System.out.println(msg);
		
		
		
		

	}

}
