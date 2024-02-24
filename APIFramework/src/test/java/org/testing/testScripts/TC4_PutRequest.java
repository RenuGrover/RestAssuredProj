package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testCases.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandler;
import org.testing.utilities.jsonHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest
{
	@Test
	public void testcase4() throws IOException
	{
		
		Properties probj =	PropertiesHandler.propertieshandle("../FrameworkRestAPI/URI.Properties");		
		String RequestBody=jsonHandler.jsonHandle("../FrameworkRestAPI/src/test/java/org/testing/resources/UpdateRquestBody.json");

		RequestBody=JsonReplacement.assignValue(RequestBody, "id", TC1_PostRequest.returnidValue);
		HTTPMethods http = new HTTPMethods(probj);
		Response resObject=http.puttMethod("QA_URI", RequestBody, TC1_PostRequest.returnidValue);
	}



}
