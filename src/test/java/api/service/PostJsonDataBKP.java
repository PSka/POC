package api.service;//package com.automation.api.service;
//
//import com.automation.api.fieldnames.AddPropFields;
//import com.automation.api.fieldnames.JsonFields_Demo;
//import com.automation.api.tests.TestRunner;
//import cucumber.api.DataTable;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.http.Method;
//
//import java.util.*;
//import java.util.List;
//
//public class PostJsonDataBKP {
//
//    private static final String PostUrl = "http://localhost:3000/posts";
//
//
//    public void PostData(String id,
//                         String title,
//                         String author,
//                         DataTable tableData) {
//
//
//        List<AddPropFields> mylist = new ArrayList<>(); // this list will help add all the results from "add"
//        int datasize = TestRunner.alltestdata.size();
//
//
//        JsonFields_Demo postfields = new JsonFields_Demo();
////        postfields.setId(id);
//        postfields.setTitle(title);
//        postfields.setAuthor(author);
//
//        for (Map<String, String> data : tableData.asMaps(String.class, String.class)) {
//
//            AddPropFields add = new AddPropFields();
//            add.setEmail(data.get("Email"));
//            add.setAddress(data.get("Address"));
//            add.setCountry(data.get("Country"));
////            add.setPhone(data.get("Phone"));
//            add.setModified(data.get("modified"));
//
//            mylist.add(add);
//        }
//        postfields.setAdditionalProperties(mylist);
//
//        RestAssured
//                .given()
//                .contentType(ContentType.JSON)
//                .body(postfields)
//                .when()
//                .request(Method.POST, PostUrl)
//                .then()
//                .statusCode(201);
//    }
//}
//
//
//
//
