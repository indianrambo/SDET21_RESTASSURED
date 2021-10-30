package sdet21_Genericutility;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import sdet21.GenericUtils.DatabaseUtilitity;
import sdet21.GenericUtils.JavaUtility;
import sdet21.GenericUtils.RestAssuredUtilities;

public class BaseApiClasss {
	public DatabaseUtilitity dLib = new DatabaseUtilitity();
	public RestAssuredUtilities rLib = new RestAssuredUtilities();
	public JavaUtility jLib = new JavaUtility();
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
       dLib.connectToDB();
       baseURI = "http://localhost";
       port = 8084;
      
	}
	
	@AfterSuite
	public void asConfig() throws Throwable {
		dLib.closeDB();
	}

}
