package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.response.Response;

//input parameter----- response object, keyname
//purpose of the method --- to parse
public class JsonParsingUsingOrgJson 
{
	public static void doParsing(Response res, String keyName)
	{
		
		JSONObject jo = new JSONObject(res.asString());
		JSONArray ja = new JSONArray("data");
		int L = ja.length();
		for(int i=0; i<L; i=i+1)
		{
			JSONObject jobj = ja.getJSONObject(i);
			System.out.println(jobj.get(keyName));
		}
		
	}

}
