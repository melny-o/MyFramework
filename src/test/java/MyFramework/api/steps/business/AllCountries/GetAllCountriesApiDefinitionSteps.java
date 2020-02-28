package MyFramework.api.steps.business.AllCountries;

import MyFramework.api.steps.composite.CallableService;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GetAllCountriesApiDefinitionSteps {
    @Autowired
    @Qualifier("GetAllCountriesApiSteps")
    private CallableService callableService;

    @When("^User call Get All Countries service$")
    public void callAllCountries(){
        callableService.call();
    }
}
