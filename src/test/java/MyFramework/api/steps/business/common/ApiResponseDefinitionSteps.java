package MyFramework.api.steps.business.common;

import MyFramework.api.resources.GetAllCountries;
import MyFramework.api.steps.flow.GetAllCountriesApiSteps;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiResponseDefinitionSteps {
    @Autowired
    private ApiResponseSteps steps;

    @When("^response status call is (\\d{3})$")
    public void verifyResponseStatusCode(int expectedStatusCode){
        assertThat(steps.getResponseStatusCode()).isEqualTo(expectedStatusCode);
    }

}
