package sdet21_Genericutility;

import io.restassured.response.Response;

public class RestAssuredUtilities {
	/**
	 * This method will return the data inside JSON path
	 * @param res
	 * @param jsonPath
	 * @return
	 */
	public String getJsonData(Response res, String jsonPath)
	{
		String value =res.jsonPath().get(jsonPath);
		return value;
	}

}
