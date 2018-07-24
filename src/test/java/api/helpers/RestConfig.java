package api.helpers;


import cucumber.api.java.Before;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class RestConfig {

    @Before
    public static void setUp() {

        RestAssured.baseURI = "http://localhost:3005";
//        RestAssured.baseURI = "http://localhost:80/api";
    }

    @BeforeClass
    public void setproxy(){
        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "3004");
        System.setProperty("java.net.useSystemProxies", "true");
        System.setProperty("java.net.preferIPv4Stack" , "true");
        System.setProperty("java.net.preferIPv6Addresses" , "true");

    }

//    public Response getResponse(RequestSpecification requestSpecification, String endpoint, int
//            status) {
//        Response response = requestSpecification.get(endpoint);
//        Assert.assertEquals(response.getStatusCode(), status);
//        response.then().log().all();
//        return response;
//    }
//
//    public void validatelocalhostdata() {
//
//        Response resp = new RestConfig()
//                .getResponse(RestAssured
//                                .given()
//                                .contentType(ContentType.JSON)
//                                .param("first_name", "Edison"),
//                        Endpoints.GET_EMPLOYEE,
//                        HttpStatus.SC_OK);
//        localHostFields[] demo = resp.as(localHostFields[].class, ObjectMapperType.GSON);
//
//
//    }
}
