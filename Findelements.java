package Day1;
//Write a script to identify total no. of links and print link text 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> ref=driver.findElements(By.tagName("a"));
		int size=ref.size();
		System.out.println(size);
		for(int i=0;i<ref.size();i++)
			{
			WebElement rv=ref.get(i);
			String str=rv.getText();
			System.out.println(str);
			};

	}

}
/*output
 26
About
Store
Gmail
Images

Sign in
Does it snow in South India?
हिन्दी
বাংলা
తెలుగు
मराठी
தமிழ்
ગુજરાતી
ಕನ್ನಡ
മലയാളം
ਪੰਜਾਬੀ
Advertising
Business
How Search works
Privacy
Terms
*/





  
