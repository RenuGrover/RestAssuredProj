package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter --- String filePath
//purpose of the method -- to read the data of json
public class jsonHandler 
{
	public static String jsonHandle(String filepath) throws FileNotFoundException 
	{
		File f = new File(filepath);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		return jo.toString();
		
	}
	
	

}
