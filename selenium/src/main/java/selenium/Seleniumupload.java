package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumupload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromeedriver.exe");
				driver.get("https://demo.guru99.com/test/upload/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
				TakesScreenshot srcShot=(TakesScreenshot)driver;
				File srcFile=srcShot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File("C:\\Users\\prave\\OneDrive\\Pictures\\Screenshots\\checkbox.png"));
				WebElement upload=driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
				upload.sendKeys("C:\\Users\\prave\\OneDrive\\Pictures\\Screenshots\\checkbox.png");
				 driver.findElement(By.name("send")).click();
			



	}

}
