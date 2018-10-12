
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
    "description",
    "docId",
    "docLocation",
    "docVersion",
    "bcMetaData"
})
public class DocDetail {

    @JsonProperty("description")
    public String description;
    @JsonProperty("docId")
    public String docId;
    @JsonProperty("docLocation")
    public String docLocation;
    @JsonProperty("docVersion")
    public String docVersion;
    @JsonProperty("bcMetaData")
    public List<BcMetaDatum> bcMetaData = null;
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
