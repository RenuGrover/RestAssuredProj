package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.HistoryPage;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;

public class TC2_SiginHistory extends Base
{
	
	@Test
	public void siginhistry() throws InterruptedException
	{

		SigninPage signin= new SigninPage(driver,pr);
		
		HistoryPage histpage = new HistoryPage(driver, pr);
		histpage.homeP();
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();
	
	}

}
