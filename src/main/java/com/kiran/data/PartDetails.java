
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
    "emPartNum",
    "cageCode",
    "description",
    "ownerPartN",
    "conditionCode",
    "quantity",
    "lotN optional",
    "partSerialN",
    "nationalStockN",
    "itarControlled",
    "barCodeTag",
    "nfcTag",
    "rfidTag",
    "geoLocation"
})
public class PartDetails {

    @JsonProperty("emPartNum")
    public String emPartNum;
    @JsonProperty("cageCode")
    public String cageCode;
    @JsonProperty("description")
    public String description;
    @JsonProperty("ownerPartN")
    public String ownerPartN;
    @JsonProperty("conditionCode")
    public String conditionCode;
    @JsonProperty("quantity")
    public Integer quantity;
    @JsonProperty("lotN optional")
    public String lotNOptional;
    @JsonProperty("partSerialN")
    public String partSerialN;
    @JsonProperty("nationalStockN")
    public String nationalStockN;
    @JsonProperty("itarControlled")
    public String itarControlled;
    @JsonProperty("barCodeTag")
    public String barCodeTag;
    @JsonProperty("nfcTag")
    public String nfcTag;
    @JsonProperty("rfidTag")
    public String rfidTag;
    @JsonProperty("geoLocation")
    public String geoLocation;
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
