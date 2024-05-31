package in.debasish.utilities;

import io.restassured.response.Response;

public class JsonParsing {
	
	public static String doParsing(Response res,String jsonPath) {
		String responseValue=res.jsonPath().get(jsonPath);
		return responseValue;
	}

}
