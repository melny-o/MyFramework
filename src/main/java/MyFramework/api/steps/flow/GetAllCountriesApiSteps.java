package MyFramework.api.steps.flow;

import MyFramework.api.resources.GetAllCountries;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class GetAllCountriesApiSteps {

    @Autowired
    public GetAllCountries resource;

    public void requestAndStoreGetAllCountries(){
        environmentContext.setResponse(doApiCall());
    }

    private Response doApiCall(){
        return resource.getCommonRequestSpecification()
                .when().get(resource.getAllCountriesApiEndpoint());
    }
}
