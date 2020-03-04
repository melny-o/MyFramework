package MyFramework.api.steps.business.common;

import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;

import javax.print.attribute.standard.RequestingUserName;

import static io.restassured.RestAssured.given;

public class CommonApiSteps {

    /*@Value("${all.properties}")
    private String apiEndpoint;*/
    private String apiEndpoint="https://restcountries.eu/rest/v2";
    protected String getApiEndpoint() {
        return apiEndpoint;
    }

    public RequestSpecification getCommonRequestSpecification(){
        return given();//.queryParam("fields", "capital;region;population");
    }
}
