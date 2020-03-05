package MyFramework.api.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(
        ignoreUnknown = true)
class CountryDTO {

    @JsonProperty("name")
    String name

    @JsonProperty("capital")
    String capital

    @JsonProperty("region")
    String region

    @JsonProperty("population")
    String population

    @JsonProperty("currencies")
    List <CurrenciesDTO> currencies

}
