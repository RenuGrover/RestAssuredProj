package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninPage 
{
	ChromeDriver driver; 
	Properties pr;
	
	public SigninPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr = pr;
		
	}
	
	public void signin(String username, String password) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("loginbutton"))).click();
		driver.findElement(By.xpath(pr.getProperty("username")));
		driver.findElement(By.xpath(pr.getProperty("nextbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("Pass@123");
		driver.findElement(By.xpath(pr.getProperty("nextbutton1"))).click();
		Thread.sleep(2000);
	}

}
