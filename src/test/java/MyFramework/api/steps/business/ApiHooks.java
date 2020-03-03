package MyFramework.api.steps.business;

import MyFramework.core.context.ScenarioContext;
import MyFramework.framework.spring.SpringConfig;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = SpringConfig.class)
public class ApiHooks {
    @After(order = 1)
    public void clearContext() {
        ScenarioContext.clear();
    }
}
