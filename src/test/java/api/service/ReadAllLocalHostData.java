package api.service;


import api.datatransfer.FilterlocalHostData;
import api.fieldnames.localHostFields;
import api.helpers.Endpoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;

import static api.helpers.Endpoints.port_number;

public class ReadAllLocalHostData{

    //    public FilterJsonData getAllBikePoints() {
//        final JsonFields[] places = RestAssured.
//                given()
////                .contentType("application/json")
//                .contentType(ContentType.JSON)
//                .when()
//                .request(Method.GET, URL)
//                .then()
//                .statusCode(200)
//                .extract()
//                .as(JsonFields[].class);
//
//        return new FilterJsonData(places);
//    }
/*
    public FilterlocalHostData getAllDemoData() {
//        authentication = basic("jetty", "jetty"); // just a dummy field. do not have any login validations
        //yet
        final localHostFields[] demo = RestAssured
                .given()
                    .port(port_number)
//                    .header("Authorization", PASSWORD)
//                    .contentType("application/json")
                    .contentType(ContentType.JSON)
//                // ********** Rule 1 Starts
//                .expect()
//                .with()
//                .param("last_name", "Smith")
//                .and()
//                .expect()
//                .body("additionalProperties.address", Matchers.equalTo(Arrays.asList("Port Minerva")))
//                // ********** Rule 1 Ends


                // ********** Rule 2 Starts
//                .expect()
//                .body("additionalProperties.country", Matchers.hasItem(Arrays.asList("Bedfordshire")))
//                .body("findAll{additionalProperties='Feestbury'}",Matchers.equalTo(Collections.singletonList("Feestbury")))

                // ********** Rule 2 Ends
                .when()
                    .request(Method.GET, Endpoints.GET_EMPLOYEE)
                .then()
//                .body("additionalProperties.address", Matchers.equalTo(Collections.singletonList("Feestbury")))
                    .statusCode(200)
                    .extract()
                    .as(localHostFields[].class);

        return new FilterlocalHostData(demo);
    }*/

    public FilterlocalHostData getAllDemoData() {

        final localHostFields[] demo = RestAssured
                .given()
                //.port(port_number)
                .contentType(ContentType.JSON)
                .when()
                .request(Method.GET, Endpoints.GET_EMPLOYEE)
                .then()
                .statusCode(200)
                .extract()
                .as(localHostFields[].class);

        return new FilterlocalHostData(demo);
    }

    public FilterlocalHostData getAllData(){
        localHostFields[] demo = RestAssured.given().contentType(ContentType.JSON).when().request(Method.GET, Endpoints.GET_EMPLOYEE).then().statusCode(200).extract().as(localHostFields[].class);
           return  new FilterlocalHostData (demo);
    }

//    public FilterlocalHostData getAllDriverData() {
//        System.out.println(baseURI + port + basePath);
//        authentication = basic("jetty", "jetty"); // just a dummy field. do not have any login validations
//        //yet
////        final localHostFields[] demo = RestAssured.
////                given()
////                .contentType("application/json")
////                .contentType(ContentType.JSON)
////                 Expected condition - Start
////                .expect()
////                .body("additionalProperties.country",hasItem("Avon"))
////                .with()
//////                .param("last_name", "Walsh")
////                .param("country","Avon")
////                 Expected condition - End
////                .when()
////                .request(Method.GET, GetURL)
////                .then()
////                .statusCode(200)
////                .extract()
////                .as(localHostFields[].class);
//
//
////        return new FilterlocalHostData(demo);
//    }
//

}




