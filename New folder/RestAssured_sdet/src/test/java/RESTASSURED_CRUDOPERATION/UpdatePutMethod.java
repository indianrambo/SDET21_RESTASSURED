package RESTASSURED_CRUDOPERATION;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdatePutMethod {
	@Test
	public void UpdateProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Manoj");
		jobj.put("projectName","love");
		jobj.put("status","on-going");
		jobj.put("teamSize",40);
		
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj);
		
		Response res=req.put("http://localhost:8084/projects");
		res.then().assertThat().statusCode(200);
	}

}
