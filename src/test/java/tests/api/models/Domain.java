package tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Domain {
    private List<DomainsList> domains;
    private Integer per_page;
    private Integer page_count;
    private Integer page;
    private Integer item_count;
}
