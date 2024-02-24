package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


//input parameter -- Properties filePath
//purpose of this method --- to load any properties file (file class, Properties class)
//output parameter --- object of properties class i.e pr, we write instead of void properties(classname)
public class PropertiesHandler
{
	public static Properties propertieshandle(String filepath) throws IOException 
	{
		File f = new File(filepath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
		
		
		
	}

}
