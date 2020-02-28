package MyFramework.api.resources;

import MyFramework.api.steps.business.common.CommonApiSteps;

public class GetAllCountries extends CommonApiSteps {

    public String getAllCountriesApiEndpoint(){
        return super.getApiEndpoint() + "/all";
    }
}
