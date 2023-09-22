package Tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class RestAPITest {


	
@Test
public void AgifyTest() throws URISyntaxException, IOException, InterruptedException, ParseException
{
	HttpRequest GetRequest = HttpRequest.newBuilder().uri(new URI("https://api.agify.io/?name=meelad")).build();
	
	HttpClient httpClient = HttpClient.newHttpClient();
	
	HttpResponse<String> getResponse = httpClient.send(GetRequest, BodyHandlers.ofString());
	JSONObject obj = (JSONObject) new JSONParser().parse(getResponse.body());
	
	//After parsing the Json response, extract the name, count and age
	String Name = (String) obj.get("name");
	Long count = (Long) obj.get("count");
	Long age = (Long) obj.get("age");
	
	
	// Asserting each with the expected output
	assertEquals(Name, "meelad");
	assertEquals(count, 21);
	assertEquals(age, 33);
}
	
}
