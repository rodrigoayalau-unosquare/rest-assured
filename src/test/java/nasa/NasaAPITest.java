package nasa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.JsonObject;
import utils.NasaJSON;
import utils.Payload;

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
	@BeforeClass(enabled=false)
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
	@Test(enabled=false)
	public void getResponse200() {
		String response = given().log().all().queryParam("api_key", key).header("Content-Type", "application/json")
		.when().get(url)
		.then().assertThat().statusCode(200).body("date", equalTo("2021-05-07")).extract().response().asString();
		
		printDetails("The response is empty? " + response.isEmpty());
		Assert.assertFalse(response.isEmpty(), "The response is empty");
		
//		printDetails(response);
//		JsonPath js = new JsonPath(response);
//		String cr = js.getString("copyright");
//		printDetails(cr);
		
	}
	
	// Deserialization for the response
	@Test(enabled=false)
	public void getResponseDeserialization() {
		RestAssured.baseURI = "https://api.nasa.gov";
		NasaJSON nasajson = given().queryParam("api_key", "Rgr0tol175zyNjjLahTVwJB7oPKJSyqbpBIpcxcI").header("Content-Type", "application/json")
				.expect().defaultParser(Parser.JSON)
		.when().get("planetary/apod").as(NasaJSON.class);
		
		printDetails(nasajson.getCopyright());
		printDetails(nasajson.getDate());
		printDetails(nasajson.getExplanation());
		printDetails(nasajson.getHdurl()); 
		printDetails(nasajson.getMedia_type()); 
		printDetails(nasajson.getService_version());
		printDetails(nasajson.getTitle());
		printDetails(nasajson.getUrl());
	}
	
	@Test(enabled=false)
	public void retrievePostData() {
		//printDetails(Payload.nasaFirstPost());
		JsonPath js = new JsonPath(Payload.azureFirstPost());
		//printDetails(js);
		String columnsDetails = js.get("columns[0].aggregate");
		int sortNumber = js.getInt("columns[0].sortOrder");
		printDetails(columnsDetails);
		printDetails(sortNumber);
		
	}
	
	@Test(enabled=false)
	public void jsonPostDummy() {
		RestAssured.baseURI = "https://tubular.azurewebsites.net/api/orders/paged";
		String response = given().header("Contente-Type", "application/json").body(Payload.azureFirstPost())
		.when().post("url to post")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String verifyPayLoad = js.get("");
	}
	
	@Test
	public void newRequest200() {
		RestAssured.baseURI = "https://tubular.azurewebsites.net";
		String response = given().log().all().header("Content-Type", "application/json").body(Payload.azureFirstPost())
				.when().post("/api/orders/paged")
				.then().assertThat().statusCode(200).extract().response().asString();
				
				printDetails("The response is empty? " + response.isEmpty());
				Assert.assertFalse(response.isEmpty(), "The response is empty");
				
			printDetails(response);
			JsonPath js = new JsonPath(response);
//			String cr = js.getString("copyright");
//			printDetails(cr);
	}

	
	@AfterClass
	public void tearDown() {
		
	}
	
	
	//Generic method to print
	static <T> void printDetails(T s) {
		System.out.println(s);
	}
	
}
