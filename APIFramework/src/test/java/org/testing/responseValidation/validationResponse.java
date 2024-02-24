package org.testing.responseValidation;

import org.testing.assertion.Assertion1;
import org.testing.utilities.JsonParsing;

import io.restassured.response.Response;

public class validationResponse 
{
	public static Boolean  validateStatusCode(int expectedStatusCode, Response res)
	{
	// we will call soft assertion
		int actualResponseCode=res.getStatusCode();
		Boolean result =Assertion1.assertion_1(expectedStatusCode, actualResponseCode);
		return result;
		
	}

	public static Boolean validateData(String expectedData, Response res, String JsonPath)
	{
		String actualValue =JsonParsing.jsonParsingUsingJsonPath(res,JsonPath);
		Boolean result =Assertion1.assertion_1(expectedData, actualValue);
		return result;
	}
	

}
