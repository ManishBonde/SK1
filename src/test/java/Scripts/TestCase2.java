package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switcTabs(driver);
		driverutilities.dropDown(sd.getDropdown(), pdata.getPropertyFile("coursedd"));
		
		TestingPage t = new TestingPage(driver);
		driverutilities.dragandDrop(driver,t.getSelcourse(),t.getCartbtn());
		
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		driverutilities.scrollBar(driver, x, y);
		t.facebooicon();
	}

}
