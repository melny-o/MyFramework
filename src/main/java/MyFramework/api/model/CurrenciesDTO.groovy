package MyFramework.api.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CurrenciesDTO {
    String code
    String name
    String symbol
}
