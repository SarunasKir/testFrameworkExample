package e2e.framework.example.helpers;

import io.restassured.response.Response;
import e2e.framework.example.ApiRequest;

import static io.restassured.RestAssured.given;

public class Executor {

  public static Response executeRequest(final ApiRequest request) {

    return given()
            .spec(request.getRequestSpecification())
            .when()
            .relaxedHTTPSValidation()
            .request(request.getMethod());
  }
}
