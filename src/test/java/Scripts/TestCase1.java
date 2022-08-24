package Scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switcTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtocartPage ad = new AddtocartPage(driver);
		driverutilities.doubleClick(driver, ad.getAddbtn());
		ad.addtocartbutton();
		driverutilities.alertPopup(driver);
	
	}

}
