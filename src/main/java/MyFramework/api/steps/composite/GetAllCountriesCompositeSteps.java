package MyFramework.api.steps.composite;

import MyFramework.api.steps.flow.GetAllCountriesApiSteps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("GetAllCountriesCompositeSteps")
public class GetAllCountriesCompositeSteps implements CallableService{

   /* @Autowired
    private GetAllCountriesApiSteps steps;*/

   private GetAllCountriesApiSteps steps = new GetAllCountriesApiSteps();
    @Override
    public void call(){
        steps.requestAndStoreGetAllCountries();
    }
}
