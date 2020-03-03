package MyFramework.api.steps.flow;

import MyFramework.api.resources.GetCountriesOfRegion;
import io.restassured.response.Response;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class GetCountriesOfRegionApiSteps {

/*@Autowired
private GetCountriesOfRegion resourse;
 */
    private GetCountriesOfRegion resourse = new GetCountriesOfRegion();

    public void requestAndStoreGetCountriesOfRegion(){
        environmentContext.setResponse(doApiCall());
    }

    public Response doApiCall(){
        return resourse.getCommonRequestSpecification()
                .when().get(resourse.getCountriesOfRegionApiEndpoint());
    }

}
