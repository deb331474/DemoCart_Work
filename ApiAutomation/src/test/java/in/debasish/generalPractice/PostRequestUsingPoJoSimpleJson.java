package in.debasish.generalPractice;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestUsingPoJoSimpleJson {
	
	private String name;
	private int id;
	private String Grade;
	private String techSkill;
	private String Address;
	private String job;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getTechSkill() {
		return techSkill;
	}

	public void setTechSkill(String techSkill) {
		this.techSkill = techSkill;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public static void main(String[] args) {

		PostRequestUsingPoJoSimpleJson psj=new PostRequestUsingPoJoSimpleJson();
		psj.setName("Debasish");
		psj.setId(12);
		psj.setGrade("A");
		psj.setTechSkill("JAVA");
		psj.setJob("QA ENGINEER");
		psj.setAddress("Bangalore");
		
		Response res = given()
		        .contentType(ContentType.JSON)
		        .body(psj)
		        .when()
		        .post("http://localhost:3000/APIBatchStudents");
		    
		    System.out.println("Status code is:" + res.statusCode());
		    System.out.println("Response data is: " + res.asPrettyString());
		
	}

}
