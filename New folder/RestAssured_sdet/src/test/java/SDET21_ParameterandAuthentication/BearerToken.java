package SDET21_ParameterandAuthentication;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class BearerToken {
	@Test
	public void bearerToken()
	{
		//create the data
		HashMap map = new HashMap();
		map.put("name", "REST-SDET21-BEARER-Token");
		
		given()
		.auth()
		.oauth2("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")
		.body(map)
		
		.when()
		.post("https://api.github.com/user/repos")
		
		.then().log().all();
		
	}

}
