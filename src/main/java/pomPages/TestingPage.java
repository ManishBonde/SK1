package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
     private WebElement selcourse;
	
	
	public WebElement getSelcourse() {
		return selcourse;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	public WebElement getFacebook() {
		return facebook;
	}

	@FindBy(id="mycart")
	private WebElement cartbtn;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void facebooicon() {
		facebook.click();
	}
	
	
}
