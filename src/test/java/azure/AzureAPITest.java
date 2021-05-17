package azure;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utils.Payload;

public class AzureAPITest {

	@Test(enabled=true, priority=1)
	public void firstPost() {
		AzurePosts.azureFirstTest();
	}

	@Test(enabled=true, priority=2)
	public void secondPost() {
		AzurePosts.azureSecondTest();
	}

	

}
