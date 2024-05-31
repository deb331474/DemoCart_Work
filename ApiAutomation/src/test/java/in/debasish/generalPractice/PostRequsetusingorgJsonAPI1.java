package in.debasish.generalPractice;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequsetusingorgJsonAPI1 {

	public static void main(String[] args) {
		
		JSONObject js=new JSONObject();
		js.put("FirstName", "Debasish");
		js.put("LastName", "Pruseth");
		js.put("City", "Sambalpur");
		js.put("Skills", "Java,SpringBoot");
		
		Response res=given().
				contentType(ContentType.JSON)
				.body(js.toString())
				.when().post("http://localhost:3000/APIBatchStudents");
		
		System.out.println("The request data is:"+res.asPrettyString());
		
		System.out.println("The status code is:"+res.getStatusCode());

	}

}
