package genericLib;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public void getPhoto(WebDriver driver,String name) {
		Date d = new Date();
		String currentDate = d.toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(AutoConstant.photopth+currentDate+name+".png");
	}

}
