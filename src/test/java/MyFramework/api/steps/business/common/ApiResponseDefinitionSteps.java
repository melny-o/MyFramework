package MyFramework.api.steps.business.common;

import MyFramework.api.model.CountryDTO;
import MyFramework.api.model.CurrenciesDTO;
import cucumber.api.java.en.Then;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;

import java.util.List;

import static MyFramework.core.context.ScenarioContext.environmentContext;
import static org.assertj.core.api.Assertions.assertThat;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

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
        System.out.println(actualResponse);
    }

    @Then("^currency in response body is (\\w+)$")
    public void verifyCountryCurrency(String _currency){
        List<CountryDTO> actualResponse = environmentContext.getResponse().as(new TypeRef<List<CountryDTO>>() {
        });
        List<CurrenciesDTO> actualCurrency = actualResponse.get(0).getCurrencies();

        //.stream().filter(x->x.getCode().equalsIgnoreCase(_currency)).findFirst().orElse(null);
        assertThat(actualCurrency.get(0).getCode()).isEqualTo(_currency);
    }

    @Then("^response body is correct with json validation$")
    public void verifyCountryCurrencyWithJsonValidator(){
        String actualResponse = environmentContext.getResponse().getBody().asString();
        assertThat(actualResponse, matchesJsonSchemaInClasspath("test.json"));
    }
}
