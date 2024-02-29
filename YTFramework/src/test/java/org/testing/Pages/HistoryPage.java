package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HistoryPage {

	ChromeDriver driver; 
	Properties pr;
	
	public HistoryPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr = pr;
		
	}
	
	public void homeP() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("SideMenu"))).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(pr.getProperty("History"))).click();
	}
	public void Subscrip() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("SideMenu"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("subscription"))).click();
	}

}
