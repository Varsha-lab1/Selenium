package Day1;
//print total no. of rows
//print specific row data
//print all books cost

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/table.html");
		List<WebElement> t=driver.findElements(By.xpath("//tr"));
		int size=t.size();
		System.out.println(size);
		
		List<WebElement> t1=driver.findElements(By.xpath("//tr[2]"));
		for(WebElement ele:t1)
		{
			String str1=ele.getText();
			System.out.println(str1+"");
		}
		List<WebElement> t2=driver.findElements(By.xpath("//td[3]"));
		for(WebElement ele:t2)
		{
			String str1=ele.getText();
			System.out.println(str1+"");
		}
		
	}

}
/*output
4
1 MAnual 1000
1000
2000
3000
*/