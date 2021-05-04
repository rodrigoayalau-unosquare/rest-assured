package nasa;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/*
 * A Java - REST Assured Framework
	Use Serialize and Deserialize
		Use Json files to pass:
			URL
			API key
			Method (POST, GET, ETC)
	Validate that the response was a success and response body has values
	Right now we are not going to validate data on the body.
	URL = https://api.nasa.gov/planetary/apod?api_key=I2DHqYUo4PAJsFsidZba3aCDpWJMsR9a3BcJLFae 
 */

public class NasaAPI {	
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@Test
	public void firstTest() {
		RestAssured.baseURI = "https://api.nasa.gov";
		String response = given().log().all().queryParam("api_key", "Rgr0tol175zyNjjLahTVwJB7oPKJSyqbpBIpcxcI").header("Content-Type", "application/json")
		.when().get("planetary/apod")
		.then().assertThat().statusCode(200).body("date", equalTo("2021-05-04")).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		String cr = js.getString("copyright");
		System.out.println(cr);
	}
	
	@AfterClass
	public void tearDown() {
		
	}
	
}
