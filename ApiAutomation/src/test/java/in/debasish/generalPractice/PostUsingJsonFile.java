package in.debasish.generalPractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PostUsingJsonFile {

	public static void main(String[] args) throws IOException {

		File f = new File("../ApiAutomation/ApiData.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);

		try {
		    JSONObject jo = new JSONObject(jt);
		    
		    Response res = given()
		        .contentType(ContentType.JSON)
		        .body(jo.toString())
		        .when()
		        .post("http://localhost:3000/APIBatchStudents");
		    
		    System.out.println("Status code is:" + res.statusCode());
		    System.out.println("Response data is: " + res.asPrettyString());
		} catch (JSONException e) {
		    e.printStackTrace();
		    System.out.println("Error parsing JSON data: " + e.getMessage());
		    // Handle the error appropriately
		} finally {
		    // Close the FileReader (optional but good practice)
		    fr.close();
		}
	    
	}

}
