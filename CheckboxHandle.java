package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//select all checkboxes inside the table
//select last three checkboxes
//select first three checkboxes

public class CheckboxHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
        List<WebElement> rows = driver.findElements(By.xpath("//table//input[@type='checkbox']"));
        for(int i=0;i<rows.size();i++)
        {
        	
        		rows.get(i).click();
        	
        	
        }
        
        List<WebElement> chk=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//for(int i=4;i<chk.size();i++)//select last three checkboxes
		//{
			//chk.get(i).click();
		//}
		for(int i=0;i<3;i++)
		{
			chk.get(i).click();
		}
	}

}
