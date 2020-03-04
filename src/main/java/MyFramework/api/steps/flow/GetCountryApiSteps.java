package MyFramework.api.steps.flow;

import MyFramework.api.resources.GetCountry;
import io.restassured.response.Response;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class GetCountryApiSteps {
    private GetCountry resourse = new GetCountry();
    public void requestAndStoreGetCountry(String country){
        Response response = resourse.getCommonRequestSpecification().pathParam("country", country)
        .when().get(resourse.getCountryEndpoint());
        environmentContext.setResponse(response);
    }
}
