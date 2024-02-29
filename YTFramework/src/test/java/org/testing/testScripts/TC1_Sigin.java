package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;

public class TC1_Sigin extends Base
{		
	
	@Test
	public void sigin() throws InterruptedException
	{
		
		SigninPage signin= new SigninPage(driver,pr);
		signin.signin("Renu", "password");
		HomePage homepage = new HomePage(driver, pr);
		homepage.homeP();
		
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();

	

	
	}

}
