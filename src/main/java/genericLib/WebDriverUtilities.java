package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a= new Actions(driver);
		a.moveToElement(ele).build().perform();;
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a= new Actions(driver);
		a.doubleClick().build().perform();
	}
	public void rightClick(WebDriver driver,WebElement ele){
		Actions a= new Actions(driver);
		a.contextClick(ele).build().perform();
	}
	public void dragandDrop(WebDriver driver,WebElement sourse,WebElement target) {
		Actions a= new Actions(driver);
		a.dragAndDrop(sourse, target).build().perform();
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switcBack(WebDriver driver) {
	    driver.switchTo().defaultContent();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void switcTabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
	}

}
