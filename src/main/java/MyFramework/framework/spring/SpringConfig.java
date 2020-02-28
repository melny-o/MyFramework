package MyFramework.framework.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("MyFramework")
@PropertySource({"all.properties"})
public class SpringConfig {

}
