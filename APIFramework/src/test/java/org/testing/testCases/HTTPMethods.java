package org.testing.testCases;

import java.util.Properties;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

//input parameter -- request body, uriKeyName
//purpose -- to hit the post request
//output parameter -- you can do void as of now
//for fetching the uri value -- from the properties file
//we need the properties object 
public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response postMethod(String uriKeyName, String requestBody)
	{
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res=
				
		given().contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		return res;
	}
	public Response getAll(String uriKeyName)
	{
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
	
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		return res;
		
	}
	public void getparticularMethod(String uriKeyName,String endPointValue)
	{
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPointValue;
		
		Response res=
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

		
	}
	
	public Response puttMethod(String uriKeyName, String requestBody,String endpointValue)
	{
		String uriValue = pr.getProperty(uriKeyName)+"/"+endpointValue;
		
		Response res=
		given().contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		return res;
	}
	
	public void deleteMethod(String uriKeyName,String endPointValue)
	{
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPointValue;
		
		Response res=
		given().contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

		
	}


}
