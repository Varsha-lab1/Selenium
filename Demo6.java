package Day1;
//to delete username by performing backspace keystroke
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String user="student";
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys("student");
		for(int i=0;i<user.length();i++)
		{
			un.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
		}

	}

}
