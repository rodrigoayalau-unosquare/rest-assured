package nasa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import utils.JsonObject;
import utils.NasaJSON;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

/*
 * A Java - REST Assured Framework
	Use Serialize and Deserialize
		Use Json files to pass:
			URL
			API key
			Method (POST, GET, ETC)
	Validate that the response was a success and response body has values - OK
	Right now we are not going to validate data on the body.
	URL = https://api.nasa.gov/planetary/apod?api_key=I2DHqYUo4PAJsFsidZba3aCDpWJMsR9a3BcJLFae	
*/

public class NasaAPITest {
	JsonObject jo = new JsonObject();
	String base_url;
	String url;
	String key;
	
	
	// URL declared and Serialization.
	@BeforeClass
	public void setUp() {
		jo.setBase_url("https://api.nasa.gov");
		jo.setUrl("planetary/apod");
		jo.setApi_key("Rgr0tol175zyNjjLahTVwJB7oPKJSyqbpBIpcxcI");
		List<String> methods = new ArrayList<String>();
		methods.add("post");
		methods.add("get");
		jo.setMethods(methods);
		base_url = jo.getBase_url();
		url = jo.getUrl();
		key = jo.getApi_key();
		RestAssured.baseURI = base_url;
	}
	
	// 200 verification test
	@Test
	public void getResponse200() {
		String response = given().log().all().queryParam("api_key", key).header("Content-Type", "application/json")
		.when().get(url)
		.then().assertThat().statusCode(200).body("date", equalTo("2021-05-05")).extract().response().asString();
		
		System.out.println("The response is empty? " + response.isEmpty());
		Assert.assertFalse(response.isEmpty(), "The response is empty");
		
//		System.out.println(response);
//		JsonPath js = new JsonPath(response);
//		String cr = js.getString("copyright");
//		System.out.println(cr);
		
	}
	
	
	// Deserialization for the response
	@Test
	public void getResponseDeserialization() {
		RestAssured.baseURI = "https://api.nasa.gov";
		NasaJSON nasajson = given().queryParam("api_key", "Rgr0tol175zyNjjLahTVwJB7oPKJSyqbpBIpcxcI").header("Content-Type", "application/json")
				.expect().defaultParser(Parser.JSON)
		.when().get("planetary/apod").as(NasaJSON.class);
		
		System.out.println(nasajson.getCopyright());
		System.out.println(nasajson.getDate());
		System.out.println(nasajson.getExplanation());
		System.out.println(nasajson.getHdurl()); 
		System.out.println(nasajson.getMedia_type()); 
		System.out.println(nasajson.getService_version());
		System.out.println(nasajson.getTitle());
		System.out.println(nasajson.getUrl());
	}

	
	@AfterClass
	public void tearDown() {
		
	}
	
}
