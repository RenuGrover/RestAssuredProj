package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;
import org.testing.Pages.VideoPlayPage;

public class TC5_SiginChanlSubsc extends Base
{
	
	@Test
	public void sigin() throws InterruptedException
	{
		SigninPage signin= new SigninPage(driver,pr);
		signin.signin("Renu", "password");
		VideoPlayPage vidplay=new VideoPlayPage(driver, pr);
		vidplay.VideoLike();
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();
	}

}
