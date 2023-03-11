package api.pojo_classes.go_rest;

import org.testng.annotations.BeforeMethod;

public class CreateGoRestUser {

    private String name;
    private String gender;
    private String status;
    private String email;

    @BeforeMethod
    public void setUp() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
