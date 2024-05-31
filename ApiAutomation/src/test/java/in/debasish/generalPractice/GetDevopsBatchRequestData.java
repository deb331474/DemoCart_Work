package in.debasish.generalPractice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetDevopsBatchRequestData {

	public static void main(String[] args) {

		Response res=given().contentType(ContentType.JSON).when().get("http://localhost:3000/DevopsBatchStudents");
		System.out.println("Status Code is "+res.getStatusCode());
		System.out.println("The complete data is: "+res.asString());
	}

}
