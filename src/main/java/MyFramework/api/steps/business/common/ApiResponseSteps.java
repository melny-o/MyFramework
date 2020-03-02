package MyFramework.api.steps.business.common;

import org.springframework.stereotype.Component;

import static MyFramework.core.context.ScenarioContext.environmentContext;

@Component
public class ApiResponseSteps {

    public int getResponseStatusCode() {
        return environmentContext.getResponse().getStatusCode();
    }

}
