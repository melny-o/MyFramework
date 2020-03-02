package MyFramework.api.steps.flow;

import MyFramework.api.resources.GetAllCountries;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static MyFramework.core.context.ScenarioContext.environmentContext;

@Component
public class GetAllCountriesApiSteps {

    @Autowired
    private GetAllCountries resource;

    public void requestAndStoreGetAllCountries(){
        environmentContext.setResponse(doApiCall());
    }

    private Response doApiCall(){
        return resource.getCommonRequestSpecification()
                .when().get(resource.getAllCountriesApiEndpoint());
    }
}
