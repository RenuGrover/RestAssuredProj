package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;
import org.testing.Pages.VideoPlayPage;

public class TC4_SiginPlayLike extends Base
{
			
			@Test
			public void siginplaylike() throws InterruptedException
			{
				SigninPage signin= new SigninPage(driver,pr);
				signin.signin("Renu", "password");
				VideoPlayPage vidplypage= new VideoPlayPage(driver, pr);
				vidplypage.VideoLike();
				
				SignOutPage signout=new SignOutPage(driver, pr);
				signout.signOut();
			
		
			}

}
