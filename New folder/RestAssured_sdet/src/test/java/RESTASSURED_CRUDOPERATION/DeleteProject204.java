package RESTASSURED_CRUDOPERATION;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject204 {
	@Test
	public void deleteproject() 
	{
		Response res=RestAssured.delete("");
		res.then().assertThat().statusCode(204);
	}

}
