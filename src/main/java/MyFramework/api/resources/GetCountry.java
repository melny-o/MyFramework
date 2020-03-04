package MyFramework.api.resources;

import MyFramework.api.steps.business.common.CommonApiSteps;

public class GetCountry extends CommonApiSteps {

    public String getCountryEndpoint(){
        return super.getApiEndpoint()+"/name/{country}";
    }

}
