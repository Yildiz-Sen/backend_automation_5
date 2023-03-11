package api.tdd;

import api.pojo_classes.go_rest.CreateGoRestUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GoRest {


    Response response;
    /**
     * ObjectMapper is a class coming form fasterxml to convert Java object to Json
     */
    ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public void goRestCRUD() throws JsonProcessingException {
        CreateGoRestUser createGoRestUser = new CreateGoRestUser();

        createGoRestUser.setName("Tech Global");
        createGoRestUser.setGender("Male");
        createGoRestUser.setEmail("tech@gamil.com");
        createGoRestUser.setStatus("active");

        response = RestAssured
                .given().log().all()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer cd6f43f79e931dc381c5c228f3e80c9f6990ec23e970e0325e206b9d241e551e")
                .body(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(createGoRestUser))
                .when().post("https://gorest.co.in/public/v2/users")
                .then().log().all().extract().response();
    }


}
