package org.testing.utilities;

import java.util.regex.Pattern;


//input parameter ---- complete request body, VariableName, VariableValue
//purpose of the method -- to assign the value to the variable in the request Body
//output parameter --- after replacement it will return the request body
public class JsonReplacement 
{
	public static String assignValue(String reqBody, String variableName, String variableValue)
	{
		reqBody=reqBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return reqBody;
	}

}
