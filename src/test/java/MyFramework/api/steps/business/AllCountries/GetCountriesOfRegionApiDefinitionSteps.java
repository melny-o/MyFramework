package MyFramework.api.steps.business.AllCountries;

import MyFramework.api.steps.flow.GetCountriesOfRegionApiSteps;
import cucumber.api.java.en.When;

public class GetCountriesOfRegionApiDefinitionSteps {

   /* @Autowired
   @Qualifier("GetCountriesOfRegionCompositeSteps")
    private CallableService callableService;*/

    //private CallableService callableService = new GetCountriesOfRegionCompositeSteps();

    @When("^Client call Get Countries Of (\\w+) Region service$")
    public void getCountriesOfRegion(String region) {
        GetCountriesOfRegionApiSteps getCountriesOfRegionApiSteps = new GetCountriesOfRegionApiSteps();
        getCountriesOfRegionApiSteps.requestAndStoreGetCountriesOfRegion(region.toLowerCase());
    }

}
