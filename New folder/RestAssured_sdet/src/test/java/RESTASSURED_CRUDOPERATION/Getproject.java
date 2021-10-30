package RESTASSURED_CRUDOPERATION;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getproject {
	@Test
	public void getallproject()
	{
		Response res=RestAssured.get("http://localhost:8084/projects");
		System.out.println(res.asString());
	}

}
