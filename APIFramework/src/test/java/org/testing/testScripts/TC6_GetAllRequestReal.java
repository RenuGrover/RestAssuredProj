package org.testing.testScripts;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testCases.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_GetAllRequestReal 
{
		@Test
		public void testCase6() throws IOException
	{
		Properties probj =	PropertiesHandler.propertieshandle("../FrameworkRestAPI/URI.Properties");
		HTTPMethods http = new HTTPMethods(probj);
		Response res=http.getAll("Real_Time_URI");
		JsonParsingUsingOrgJson.doParsing(res, "id");

	}
}
