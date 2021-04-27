package e2e.framework.example;

import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class ApiRequest {

  private Method method;
  private RequestSpecification requestSpecification;

  public ApiRequest(final Method pMethod,
                    final RequestSpecification pRequestSpecification) {

    this.method = pMethod;
    this.requestSpecification = pRequestSpecification;
  }

  public Method getMethod() {
    return this.method;
  }

  public RequestSpecification getRequestSpecification() {
    return this.requestSpecification;
  }
}
