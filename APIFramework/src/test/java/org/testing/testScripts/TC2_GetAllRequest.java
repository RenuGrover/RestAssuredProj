package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testCases.HTTPMethods;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

public class TC2_GetAllRequest 
{
	@Test
	public void testCase2() throws IOException 
	{
		Random r = new Random();
		Integer idValue = r.nextInt();
//		System.out.println("Please Enter value of id ");
//		Scanner s = new Scanner(System.in);
//		Integer idValue = s.nextInt();
		
		Properties probj =	PropertiesHandler.propertieshandle("../FrameworkRestAPI/URI.Properties");
		HTTPMethods http = new HTTPMethods(probj);
		http.getAll("QA_URI");
		
		
	}

}
