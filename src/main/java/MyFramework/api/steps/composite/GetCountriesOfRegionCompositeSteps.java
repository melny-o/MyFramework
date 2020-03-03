package MyFramework.api.steps.composite;

import MyFramework.api.steps.flow.GetAllCountriesApiSteps;

public class GetCountriesOfRegionCompositeSteps implements CallableService{

    private GetAllCountriesApiSteps steps;

    /* @Autowired
    private GetAllCountriesApiSteps steps;*/

    @Override
    public void call(){
        steps.requestAndStoreGetAllCountries();
    }

}
