package MyFramework.api.steps.business.common;

import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;

import javax.print.attribute.standard.RequestingUserName;

import static io.restassured.RestAssured.given;

public class CommonApiSteps {

    @Value("${all.properties}")
    private String apiEndpoint;

    protected String getApiEndpoint() {
        return apiEndpoint;
    }

    public RequestSpecification getCommonRequestSpecification(){
        return given();
    }
}
