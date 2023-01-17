package tests.api.models;

import lombok.Data;

@Data
public class LoginResponse {
    private String uid;
    private String sid;
}
