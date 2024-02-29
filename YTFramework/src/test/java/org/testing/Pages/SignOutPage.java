package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOutPage 
{
	ChromeDriver driver; 
	Properties pr;
	
	public SignOutPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr = pr;
		
	}
	
	public void signOut() throws InterruptedException
	{
		driver.findElement(By.linkText(pr.getProperty("logout"))).click();
	}


}
