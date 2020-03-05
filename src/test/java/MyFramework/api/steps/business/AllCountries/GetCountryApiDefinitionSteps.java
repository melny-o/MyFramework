package MyFramework.api.steps.business.AllCountries;

import MyFramework.api.steps.flow.GetCountryApiSteps;
import cucumber.api.java.en.When;

public class GetCountryApiDefinitionSteps {

    private GetCountryApiSteps getCountryApiSteps = new GetCountryApiSteps();

    @When("^Client call Get Country (\\w+)$")
    public void getCountry(String country){
        getCountryApiSteps.requestAndStoreGetCountry(country);
    }

}
