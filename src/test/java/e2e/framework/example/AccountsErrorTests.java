package e2e.framework.example;

import e2e.framework.example.config.ConfigurationManager;
import e2e.framework.example.helpers.Executor;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Example Test")
@Feature("Example Test")
public class AccountsErrorTests {

    @Test
    @Story("Example Test")
    @DisplayName("Example Test")
    @Description("Example Test")
    public void exampleTest() {

        //Given
        String city = "Vilnius";

        RequestSpecification requestSpecification = given();

        requestSpecification.header("Content-type", ContentType.JSON);
        requestSpecification.baseUri(ConfigurationManager.getBaseUrl());
        requestSpecification.queryParam("q", city);
        requestSpecification.queryParam("appid", ConfigurationManager.getAppId());

        //When

        ApiRequest request = new ApiRequest(Method.GET, requestSpecification);
        Response response = Executor.executeRequest(request);

        //Then
        assertThat(response.statusCode()).isEqualTo(200);
    }


    @Test
    @Story("Example everything in one Test")
    @DisplayName("Example everything in one Test")
    @Description("Example everything in one Test")
    public void exampleEverythingInOneTest() {

        //Given
        String city = "Vilnius";
        String appId = "e0b2cc4ff5c7d5196faa874cf86f7227";
        String baseUri = "https://api.openweathermap.org/data/2.5/weather";


        Response response = given()
                .baseUri(baseUri)
                .queryParam("q", city)
                .queryParam("appid", appId)
                .header("Content-Type", ContentType.JSON)
        //When
                .when()
                .relaxedHTTPSValidation()
                .request(Method.GET);



        //Then
        assertThat(response.statusCode()).isEqualTo(200);
    }
}
