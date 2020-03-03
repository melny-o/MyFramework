package MyFramework.api.resources;

import MyFramework.api.steps.business.common.CommonApiSteps;
import org.springframework.stereotype.Component;

@Component
public class GetCountriesOfRegion extends CommonApiSteps {

    public String getCountriesOfRegionApiEndpoint(){
        return super.getApiEndpoint()+"/regionalbloc/eu";
    }

}
