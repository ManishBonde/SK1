package genericLib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities driverutilities= new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pdata.getPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	public void closeApp(ITestResult res) {
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			ScreenShot s = new ScreenShot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}

}
