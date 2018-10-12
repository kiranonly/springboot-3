
package com.kiran.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "country",
    "locality",
    "region",
    "street",
    "street2",
    "street3",
    "postalCode",
    "postOfficeBoxNumber"
})
public class Address {

    @JsonProperty("city")
    public String city;
    @JsonProperty("country")
    public String country;
    @JsonProperty("locality")
    public String locality;
    @JsonProperty("region")
    public String region;
    @JsonProperty("street")
    public String street;
    @JsonProperty("street2")
    public String street2;
    @JsonProperty("street3")
    public String street3;
    @JsonProperty("postalCode")
    public String postalCode;
    @JsonProperty("postOfficeBoxNumber")
    public String postOfficeBoxNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
