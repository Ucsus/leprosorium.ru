package tests.api.models;

import lombok.Data;

@Data
public class UserInfo {
    private Boolean active;
    private Boolean deleted;
    private String gender;
    private String login;
    private String email;
    private String rank;
    private Integer id;
}

