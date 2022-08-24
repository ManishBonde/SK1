package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtowishlistPage;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchtextbox(pdata.getPropertyFile("coursename"));
		s.searchbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		AddtowishlistPage ad = new AddtowishlistPage(driver);
		ad.cookiespopup();
		
		driverutilities.switchFrame(driver);
		ad.playbutton();
		Thread.sleep(8000);
		ad.pausebutton();
		driverutilities.switcBack(driver);
		ad.addtowishlist();
		
	}
}
