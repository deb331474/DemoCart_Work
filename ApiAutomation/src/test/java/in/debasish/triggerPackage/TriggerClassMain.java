package in.debasish.triggerPackage;

import in.debasish.testScripts.TC2_GetAllApiBatchStudents;
import in.debasish.testScripts.TC2_PostRequestAPIBatchUsingUserInput;
import in.debasish.testScripts.TC3_GetParticularAPIBatch;
import in.debasish.testScripts.TC4_GetApiStudentByName;
import in.debasish.testScripts.TC5_GetApiStudentByPL;
import in.debasish.testScripts.TC6_PutRequest;
import in.debasish.testScripts.TC7_DeleteParticularRequest;

public class TriggerClassMain {

	public static void main(String[] args) throws Exception {

		TC2_PostRequestAPIBatchUsingUserInput tc1 = new TC2_PostRequestAPIBatchUsingUserInput();
		tc1.TC2_PostApi();
		TC2_GetAllApiBatchStudents tc2 = new TC2_GetAllApiBatchStudents();
		tc2.getAllApiBatchTest();

		TC3_GetParticularAPIBatch tc3 = new TC3_GetParticularAPIBatch();
		tc3.TC3_GetParticularTest();
		TC4_GetApiStudentByName tc4 = new TC4_GetApiStudentByName();
		tc4.getApiBatchStudentByNameTest();

		TC5_GetApiStudentByPL tc5 = new TC5_GetApiStudentByPL();
		tc5.getApiBatchStudentByNameTest();
		
		TC6_PutRequest tc6=new TC6_PutRequest();
		tc6.testcase6Put();
		
		TC7_DeleteParticularRequest tc7=new TC7_DeleteParticularRequest();
		tc7.deleteParticularRequest();

	}

}
