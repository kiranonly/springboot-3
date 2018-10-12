
package com.kiran.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bcPartId",
    "partDetails",
    "oem",
    "owner",
    "transitOwner",
    "docDetails",
    "bomDetails",
    "suspiciousMessage"
})
public class Part {

    @JsonProperty("bcPartId")
    public String bcPartId;
    @JsonProperty("partDetails")
    public PartDetails partDetails;
    @JsonProperty("oem")
    public Oem oem;
    @JsonProperty("owner")
    public Owner owner;
    @JsonProperty("transitOwner")
    public TransitOwner transitOwner;
    @JsonProperty("docDetails")
    public List<DocDetail> docDetails = null;
    @JsonProperty("bomDetails")
    public List<BomDetail> bomDetails = null;
    @JsonProperty("suspiciousMessage")
    public String suspiciousMessage;
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
