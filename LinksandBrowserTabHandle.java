package Day2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksandBrowserTabHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> alllinks=driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		System.out.println(alllinks.size());
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.partialLinkText("Seleni"));
		for(int i=0;i<links.size();i++)
		{
			
			links.get(i).click();
											
		}
		Set<String> windowIds=driver.getWindowHandles();
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			if(title.equals("Selenium in biology - Wikipedia"))
			{
				driver.close();
			}
		}
					
		}
		
}
	


