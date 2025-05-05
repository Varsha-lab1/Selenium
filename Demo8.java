package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Write a test script to identify element size and location
public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys("student");
		Dimension d=un.getSize();
		int height=d.getHeight();
		int width=d.getWidth();
		System.out.println("Element height="+height);
		System.out.println("Element width="+width);
		
		//
		Point p=un.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println("Element x position="+x);
		System.out.println("Element y positioin="+y);
	}

}
/*output
Element height=47
Element width=600
Element x position=460
Element y positioin=542
*/