package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtablehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromeedriver.exe");
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
		        System.out.println(innerText); 
		        

				driver.get("https://demo.guru99.com/test/web-table-element.php");
				String value = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[5]/td[4]")).getText();
				System.out.println(value);
	}

}
