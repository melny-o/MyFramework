package MyFramework.api.steps.business.AllCountries;

import MyFramework.api.steps.composite.CallableService;
import MyFramework.api.steps.composite.GetAllCountriesCompositeSteps;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class GetAllCountriesApiDefinitionSteps {
    /*@Autowired
    @Qualifier("GetAllCountriesCompositeSteps")
    private CallableService callableService;*/
    private CallableService callableService = new GetAllCountriesCompositeSteps();
    @When("^Client call Get All Countries service$")
    public void callAllCountries(){
        callableService.call();
        System.out.println(environmentContext.getResponse().asString());
    }

}
