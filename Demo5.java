package Day1;
//Write a test script to delete username text without using clear method
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
				un.sendKeys("student");
		Thread.sleep(2000);
		un.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		un.sendKeys(Keys.DELETE);
		
		
		
		

	}

}
