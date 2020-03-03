package MyFramework.api.steps.business.AllCountries;

import MyFramework.api.steps.composite.CallableService;
import MyFramework.api.steps.composite.GetCountriesOfRegionCompositeSteps;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class GetCountriesOfRegionApiSteps {

   /* @Autowired
   @Qualifier("GetCountriesOfRegionCompositeSteps")
    private CallableService callableService;*/

    private CallableService callableService = new GetCountriesOfRegionCompositeSteps();

    @When("^User call Get Countries Of Region service$")
    public void getCountriesOfRegion() {
        callableService.call();
    }

}
