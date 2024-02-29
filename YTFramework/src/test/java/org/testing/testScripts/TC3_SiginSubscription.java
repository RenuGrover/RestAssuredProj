package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.HistoryPage;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;

public class TC3_SiginSubscription extends Base
{
	
	@Test
	public void siginsubs() throws InterruptedException
	{

		SigninPage signin= new SigninPage(driver,pr);
		signin.signin("Renu", "password");
		HistoryPage histpage = new HistoryPage(driver, pr);
		histpage.Subscrip();
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();
	
	}


}
