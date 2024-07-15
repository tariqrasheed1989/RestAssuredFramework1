package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		
		
		StepDefinitions m=new StepDefinitions();
		
		if(StepDefinitions.place_id == null) {
		m.add_place_payload_with("shetty", "french", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "Post");
		m.verify_place_id_created_maps_to_using("shetty", "GetPlaceAPI");
		}
	}

}
