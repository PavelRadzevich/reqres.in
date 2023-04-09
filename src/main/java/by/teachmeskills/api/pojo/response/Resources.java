package by.teachmeskills.api.pojo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resources {
    private Integer page;
    @JsonProperty("per_page")
    private Integer perpPage;
    private Integer total;
    @JsonProperty("total_pages")
    private Integer totalPages;
    private ArrayList<ResourceData> data;
    private ResourceSupport support;
}
