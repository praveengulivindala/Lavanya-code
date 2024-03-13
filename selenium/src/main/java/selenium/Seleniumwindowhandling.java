package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwindowhandling {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromeedriver.exe");
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,350)", "");
		 driver.findElement(By.id("windowButton")).click();
		//driver.findElement(By.xpath("//*[text()='New Tab']")).click();
		String mainwindowhandle=driver.getWindowHandle();
		Set<String> allwindowhandles=driver.getWindowHandles();
		Iterator<String> iterator=allwindowhandles.iterator();
		while(iterator.hasNext()) {
			String childwindow = iterator.next();
			if(!mainwindowhandle.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
            
			
				
			}
		}

	}

}
