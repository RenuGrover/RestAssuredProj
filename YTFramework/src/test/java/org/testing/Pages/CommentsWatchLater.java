package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommentsWatchLater 
{
	ChromeDriver driver; 
	Properties pr;
	
	public CommentsWatchLater(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr = pr;
		
	}
	public void comments() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("videoPlay"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("comments"))).sendKeys("Nice");
		driver.findElement(By.xpath(pr.getProperty("commentsclick"))).click();
		Thread.sleep(2000);	
		
	}
	public void watchLater() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("videoPlay"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("subscribechannel"))).click();
		Thread.sleep(2000);
	}

}
