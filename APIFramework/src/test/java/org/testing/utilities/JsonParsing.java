package org.testing.utilities;

import io.restassured.response.Response;

//input parameter --- response object,jsonPath
//purpose of the method -- to parse from the response based upon the jsonPath
//output parameter --- after parsing it will return the value
public class JsonParsing 
{
	public static String jsonParsingUsingJsonPath(Response res, String jsonPath)
	{
		String extractedValue =res.jsonPath().get(jsonPath);
		return extractedValue;
	}
	

}
