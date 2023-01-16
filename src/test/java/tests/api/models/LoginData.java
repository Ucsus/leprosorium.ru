package tests.api.models;

import lombok.Data;

@Data
public class LoginData {
    private String username;
    private String password;
    private String uid;
    private String sid;
}
