package MyFramework.api.steps.flow;

import MyFramework.api.resources.GetCountriesOfRegion;
import io.restassured.response.Response;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class GetCountriesOfRegionApiSteps {

/*@Autowired
private GetCountriesOfRegion resourse;
 */
    private GetCountriesOfRegion resourse = new GetCountriesOfRegion();

    public void requestAndStoreGetCountriesOfRegion(String region){
        Response response = resourse.getCommonRequestSpecification().pathParam("region", region)
                .when().get(resourse.getCountriesOfRegionApiEndpoint());
        environmentContext.setResponse(response);
    }

}
