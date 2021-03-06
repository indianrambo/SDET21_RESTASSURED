package SDET21_EndtoEndRMGY;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import sdet21.GenericUtils.EndPoints;
import sdet21.POJO.Class.ProjectLibrary;

public class CreateProjectandVerifyinDataBase {

	@Test
	public void createProjectAndVerifyInDB() throws Throwable
	{

		//create a project thru API
		ProjectLibrary pLib = new ProjectLibrary("Junaid", "Firefox "+jLib.getRandomNumber(), "Created", 45);
		
		Response res = given()
		.contentType(ContentType.JSON)
		.body(pLib)
		.when()
		.post(EndPoints.addProject);
		
		res.then().log().all();
		
		//capture the expected data
		String expData = rLib.getJsonData(res, "projectName");
		System.out.println(expData);
		
		//verify it in database
		String query = "select * from project";
		String actData = dLib.executeQueryAndGetData(query, 4, expData);
		
		//validate
		Assert.assertEquals(actData, expData);
		System.out.println("sucessful");
		
		
	}


}
