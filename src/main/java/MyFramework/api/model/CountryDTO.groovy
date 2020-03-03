package MyFramework.api.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
class CountryDTO {
    String capital
    String region
    String population
}
