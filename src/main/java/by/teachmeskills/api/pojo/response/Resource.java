package by.teachmeskills.api.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Resource {
    private ResourceData data;
    private ResourceSupport support;
}
