package demoQA.step_definitions;

import demoQA.utils.ConfigurationReader;
import io.cucumber.java.Before;
import io.restassured.RestAssured;


// runs before and after every test in cucumber framework. Setting up our baseURL here
public class Hooks {

    @Before
    public void setUpApiRequest() {
        RestAssured.baseURI = ConfigurationReader.getProperty("apiURL");
    }
}
