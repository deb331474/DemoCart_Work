package in.debasish.generalPractice;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestDatausingPOJOArrayJSON {

	private String name;
	private int id;
	private String Grade;
	private String job;
	private AddressInfo[] adress;
	private TechSkillInfo[] skills;

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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public AddressInfo[] getAdress() {
		return adress;
	}

	public void setAdress(AddressInfo[] adress) {
		this.adress = adress;
	}

	public TechSkillInfo[] getSkills() {
		return skills;
	}

	public void setSkills(TechSkillInfo[] skills) {
		this.skills = skills;
	}

	public static void main(String[] args) {

		AddressInfo[] address1 = new AddressInfo[1];
	    address1[0] = new AddressInfo();
	    address1[0].setHouseNo("H54");
	    address1[0].setLane("SGR Dental College");
	    address1[0].setPincode((long) 456879);

	    TechSkillInfo[] skills1 = new TechSkillInfo[1];
	    skills1[0] = new TechSkillInfo();
	    skills1[0].setSkill1("Java");
	    skills1[0].setSkill2("Python");
	    skills1[0].setSkill3("HTML");

	    AddressInfo[] address2 = new AddressInfo[1];
	    address2[0] = new AddressInfo();
	    address2[0].setHouseNo("M94");
	    address2[0].setLane("Multiplex Road");
	    address2[0].setPincode((long) 12356);

	    TechSkillInfo[] skills2 = new TechSkillInfo[1];
	    skills2[0] = new TechSkillInfo();
	    skills2[0].setSkill1("Ruby");
	    skills2[0].setSkill2("Scala");
	    skills2[0].setSkill3("C#");


	    PostRequestDatausingPOJOArrayJSON pArrayJson=new PostRequestDatausingPOJOArrayJSON();
	    pArrayJson.setId(12);
	    pArrayJson.setId(1);
	    // Set data based on the ID
	    if (pArrayJson.getId() == 12) {
	      pArrayJson = new PostRequestDatausingPOJOArrayJSON();
	      pArrayJson.setName("Subhasish");
	      pArrayJson.setGrade("B");
	      pArrayJson.setJob("Software Engineer");
	      pArrayJson.setAdress(address1);
	      pArrayJson.setSkills(skills1);
	    } else {
	      pArrayJson = new PostRequestDatausingPOJOArrayJSON();
	      pArrayJson.setName("Debasish"); // Replace with your desired name
	      pArrayJson.setGrade("A"); // Replace with your desired grade
	      pArrayJson.setJob("Data Scientist"); // Replace with your desired job
	      pArrayJson.setAdress(address2);
	      pArrayJson.setSkills(skills2);
	    }

		/*
		 * Response res = given().contentType(ContentType.JSON).body(pArrayJson).when()
		 * .post("http://localhost:3000/APIBatchStudents");
		 * 
		 * System.out.println("Status code is:" + res.statusCode());
		 * System.out.println("Response data is: " + res.asPrettyString())
		 */;
	  }

}
