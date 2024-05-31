  package in.debasish.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String assighnJsonValues(String reqBody,String variableName,String variableValue) {
		reqBody=reqBody.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		return reqBody;
		
	}

}
