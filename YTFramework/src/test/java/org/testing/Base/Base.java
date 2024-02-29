package org.testing.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void siginlaunchbrowser() throws IOException
	{
	ChromeOptions co = new ChromeOptions().setBinary("/Users/renugrover/Downloads/chromedriver-mac-x64/chromedriver.exe");
	driver = new ChromeDriver(co);
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	File f = new File("../YTFramework/Object.properties");
	FileReader fr = new FileReader(f);
	pr = new Properties();
	pr.load(fr);
	
	}

	@AfterMethod
	public void siginclosebrowser()
	{
		driver.close();
	}

}
