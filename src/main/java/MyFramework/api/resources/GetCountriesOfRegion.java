package MyFramework.api.resources;

import MyFramework.api.steps.business.common.CommonApiSteps;
import org.springframework.stereotype.Component;

import javax.ws.rs.Path;

@Component
public class GetCountriesOfRegion extends CommonApiSteps {

    public String getCountriesOfRegionApiEndpoint(){
        return super.getApiEndpoint()+"/regionalbloc/{region}";
    }

}
