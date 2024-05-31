package in.debasish.testScripts;

import java.util.Properties;

import in.debasish.testSteps.HTTPMethods;
import in.debasish.utilities.PropertiesHandle;

public class TC4_GetApiStudentByName {
	
	public void getApiBatchStudentByNameTest() throws Exception {
		
		Properties p=PropertiesHandle.loadProperties("../ApiAutomation/URI.properties");
		Properties p1=PropertiesHandle.loadProperties("../ApiAutomation/test-config.properties");
		
		String name=p1.getProperty("api.name");
		HTTPMethods hm=new HTTPMethods(p);
		hm.getAPIBatchStudentsByName("QA_URI_API",name);
	}
	
	

}
