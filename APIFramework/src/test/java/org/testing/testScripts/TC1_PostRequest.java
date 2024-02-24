package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.validationResponse;
import org.testing.testCases.HTTPMethods;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandler;
import org.testing.utilities.jsonHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{	
		public static String returnidValue;
		@Test
		public void testCase1() throws IOException
		{
			Random r = new Random();
			Integer idValue = r.nextInt();
			
//			System.out.println("Please Enter value of id ");
//			Scanner sc = new Scanner(System.in);
//			Integer idValue = sc.nextInt();
			
			Properties probj =	PropertiesHandler.propertieshandle("../FrameworkRestAPI/URI.Properties");		
			String RequestBody=jsonHandler.jsonHandle("../FrameworkRestAPI/src/test/java/org/testing/resources/RequestBody.json");
//			System.out.println(RequestBody);
			RequestBody=JsonReplacement.assignValue(RequestBody, "id", idValue.toString());
			HTTPMethods http = new HTTPMethods(probj);
			Response resObject=http.postMethod("QA_URI", RequestBody);
			Boolean result = validationResponse.validateStatusCode(201, resObject);
			Assert.assertTrue(result);
			
			returnidValue=JsonParsing.jsonParsingUsingJsonPath(resObject, "id");
			System.out.println("Parsing " +returnidValue);
			
			
		}



}
