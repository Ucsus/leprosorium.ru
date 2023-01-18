package tests.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainsList {
    private Boolean is_in_bookmarks;
    private String description;
    private Boolean is_mythings_subscribed;
    private Integer readers_count;
    private Boolean is_subscribed;
    private String prefix;
    private String domain_owner_title;
    private Integer id;
    private Boolean is_readable_for_everyone;
    private String idna_url;
    private String name;
    private String title;
    private String idna_prefix;
    private String url;
    private String logo_url;
}
