package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage
{
	ChromeDriver driver; 
	Properties pr;
	
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr = pr;
		
	}
	
	public void homeP() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("SideMenu"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Trending"))).click();
	}

}
