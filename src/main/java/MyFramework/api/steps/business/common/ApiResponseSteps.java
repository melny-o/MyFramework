package MyFramework.api.steps.business.common;

import static MyFramework.core.context.ScenarioContext.environmentContext;

public class ApiResponseSteps {

    public int getResponseStatusCode() {
        return environmentContext.getResponse().getStatusCode();
    }

}
