package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumfindelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromeedriver.exe");
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		List<WebElement> elementslist = driver.findElements(By.xpath("//*[@id='article']"));
		System.out.println("listofelements:" + elementslist.size());
		driver.quit();
	

	}

}
