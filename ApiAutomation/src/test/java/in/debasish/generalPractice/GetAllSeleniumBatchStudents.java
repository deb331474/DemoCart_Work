package in.debasish.generalPractice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllSeleniumBatchStudents {

	public static void main(String[] args) {
		
		Response res=given().contentType(ContentType.JSON).when().get("http://localhost:3000/SeleniumBatchStudents");
		
		System.out.println(res.getStatusCode());
		System.out.println(res.asPrettyString());

		
	}

}
