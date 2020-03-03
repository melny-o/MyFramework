package MyFramework.api.steps.business.common;

import MyFramework.api.model.CountryDTO;
import MyFramework.api.resources.GetAllCountries;
import MyFramework.api.steps.flow.GetAllCountriesApiSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.common.mapper.TypeRef;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static MyFramework.core.context.ScenarioContext.environmentContext;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiResponseDefinitionSteps {
    /*@Autowired
    private ApiResponseSteps steps;*/
    private ApiResponseSteps steps = new ApiResponseSteps();
    @Then("^response status call is (\\d{3})$")
    public void verifyResponseStatusCode(int expectedStatusCode){
        assertThat(steps.getResponseStatusCode()).isEqualTo(expectedStatusCode);
    }

    //@Then("^response body contains ([\\w\\s]+), ([\\w\\s]+) and ([\\w\\s]+) of each country$")
    @Then("^response body contains capital, region and population of each country$")
    public void verifyCountries(){
        List<CountryDTO> actualResponse = environmentContext.getResponse().as(new TypeRef<List<CountryDTO>>() {
        });
        assertThat(actualResponse)
                .allMatch(country->!country.getCapital().isEmpty()&&!country.getPopulation().isEmpty()&&!country.getRegion().isEmpty());

    }
}
