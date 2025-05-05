package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////Write a test script to verify username and password field hight ,width is same or not

public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
		//un.sendKeys("student");
		Dimension d=un.getSize();
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println("height="+h+"Width="+w);
		
		//
		WebElement un1=driver.findElement(By.name("password"));
		Dimension d1=un1.getSize();
		int h1=d1.getHeight();
		int w1=d1.getWidth();
		System.out.println("height ="+h1+"width="+w1);
		
		if(h==h1&&w==w1)
		{
			System.out.println("both field height and width are same");

		}
		else
		{
			System.out.println("both field height and width are not same");
		}
	}

}
/*output
height=47Width=600
height =47width=600
both field height and width are same
*/