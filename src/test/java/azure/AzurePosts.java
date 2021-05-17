package azure;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utils.Payload;

public class AzurePosts {
	
	

	public static void azureFirstTest() {
		RestAssured.baseURI = "https://tubular.azurewebsites.net";
		String response = given().log().all().header("Content-Type", "application/json").body(Payload.azureFirstPost())
				.when().post("/api/orders/paged").then().assertThat().statusCode(200).extract().response().asString();

		printDetails("The response is empty? " + response.isEmpty());
		Assert.assertFalse(response.isEmpty(), "The response is empty");

		printDetails(response);
		JsonPath js = new JsonPath(response);
		int cp = js.get("CurrentPage");
		printDetails("CurrentPage: " + cp);
	}
	
	public static void azureSecondTest() {
		RestAssured.baseURI = "https://tubular.azurewebsites.net";
		String response = given().log().all().header("Content-Type", "application/json").body(Payload.azureSecondPost())
				.when().post("/api/orders/paged").then().assertThat().statusCode(200).extract().response().asString();

		printDetails("The response is empty? " + response.isEmpty());
		Assert.assertFalse(response.isEmpty(), "The response is empty");

		printDetails(response);
		JsonPath js = new JsonPath(response);
		int cp = js.get("CurrentPage");
		printDetails("CurrentPage: " + cp);
	}

	// Generic method to print
	private static <T> void printDetails(T s) {
		System.out.println(s);
	}

}
