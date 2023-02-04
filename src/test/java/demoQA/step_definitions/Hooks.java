package demoQA.step_definitions;

import demoQA.utils.ConfigurationReader;
import io.restassured.RestAssured;
import org.junit.Before;

// runs before and after every test in cucumber framework. Setting up our baseURL here
public class Hooks {

    @Before
    public void setUpApiRequest() {
        RestAssured.baseURI = ConfigurationReader.getProperty("apiURL");
    }
}
