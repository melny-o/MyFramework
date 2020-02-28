package MyFramework.api.steps.composite;

import MyFramework.api.steps.flow.GetAllCountriesApiSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class GetAllCountriesCompositeSteps implements CallableService{

    @Autowired
    private GetAllCountriesApiSteps steps;

    @Override
    public void call(){
        steps.requestAndStoreGetAllCountries();
    }
}
