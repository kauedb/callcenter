package com.callcenter;

import com.callcenter.domain.User;
import com.jayway.restassured.http.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;

/**
 * callcenter
 * User: Kauê Q. Carbonari
 * Date: 9/26/13
 * Time: 12:37 PM
 */
public class UserControllerTest {

    final String baseURL = "http://localhost:8080/callcenter/";
    private Logger LOGGER = LoggerFactory.getLogger(UserControllerTest.class);

    @Test
    public void findLee() throws Exception {

        expect()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("login", equalTo("blee"))
                .and()
                .body("password", equalTo("!@#$%^&*^%"))
                .when().get(baseURL + "user/1");

    }

    @Test
    public void updateLee() throws Exception {

        final User user = new User();
        user.setLogin("blee");
        user.setPassword("1234");

        expect()
                .statusCode(200)
                .given()
                .contentType(ContentType.JSON)
                .request()
                .body(user)
                .put(baseURL + "/user");

    }

    @Test
    public void deleteLee() throws Exception {

        expect()
                .statusCode(200)
                .when()
                .delete(baseURL + "/user/1").andReturn().prettyPrint();

    }

    @Test
    public void addLee() throws Exception {


        final User user = new User();
        user.setLogin("blee");
        user.setPassword("!@#$%^&*^%");


        expect().statusCode(200).
                given().contentType(ContentType.JSON)
                .request()
                .body(user)
                .put(baseURL + "/user").andReturn().prettyPrint();


    }

    @Test
    public void findAll() throws Exception {

        expect()
                .statusCode(200)
                .when()
                .get(baseURL + "/user").andReturn().prettyPrint();

    }

}
