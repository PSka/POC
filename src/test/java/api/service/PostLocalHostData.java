package api.service;

import api.fieldnames.contacts;
import api.fieldnames.localHostFields;
import api.fieldnames.nationalAccreditationDatas;
import api.fieldnames.states;
import api.helpers.Endpoints;
import cucumber.api.DataTable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static api.helpers.Endpoints.PASSWORD;
import static api.helpers.Endpoints.port_number;
//import static com.google.common.truth.Truth.assertWithMessage;


public class PostLocalHostData {

    public void PostData(DataTable tableData) {
        localHostFields postfields = new localHostFields(); // this list will help add all the results from "add"
//       List<List<Object>> mydata = TestRunner.alltestdata;
//        System.out.println("hello");
//
//        int totallists = TestRunner.alltestdata.size();
//        int datacount = ((ArrayList) TestRunner.alltestdata.get(0)).size();
//
//        for (int i = 0; i <= totallists; i++) {
//            List data = mydata
//                    .get(i)
//                    .stream()
//                    .collect(Collectors.toList());
//        }

        for (Map<Object, Object> data : tableData.asMaps(Object.class, Object.class)) { //to read data table
            String val = (String) data.get("monitored");
            Boolean b = Boolean.valueOf(val);

            Object newid = data.get("id");
            if (newid.equals("")) {
                postfields.setId(null);
            }

            postfields.setEbaId((String) data.get("ebaId"));
            postfields.setName((String) data.get("name"));
            postfields.setComments((String) data.get("comments"));

//adding contact Data

            List<String> terms = new ArrayList<>();
            String address = (String) data.get("address");
            terms.add(address);

            contacts contact = new contacts();
            contact.setEmail((String) data.get("email"));
            contact.setPhone((String) data.get("phonenumber"));
            contact.setCity((String) data.get("city"));
            contact.setAddressLines(terms);

            postfields.setContact(contact);

//adding States Data
            states state = new states();
            state.setStatus((String) data.get("status"));
            state.setMonitored(b);
            postfields.setState(state);

//adding National Accreditation Data

            // national ID
            nationalAccreditationDatas na = new nationalAccreditationDatas();
            na.setNationalId((String) data.get("nationalId"));
//            na.setAccreditations(nationaccreditation);


            // nation Accreditation
//            List<String> nationaccreditation = new ArrayList<>();
            String nationaccred = (String) data.get("nationalaccr");
            String[] myList0 = nationaccred.split(",");
            if (Arrays.stream(myList0).anyMatch(""::equals)) {
                na.setNationalaccreditations(null);
            } else {
                na.setNationalaccreditations(Arrays.asList(myList0));
            }
            postfields.setNationalAccreditationData(na);

//adding Accreditations Data
//            List<String> accreditations = new ArrayList<>();

            String accred = (String) data.get("accreditations");
            String[] myList1 = accred.split(",");
            if (Arrays.stream(myList1).anyMatch(""::equals)) {
                postfields.setAccreditations(null);
            } else {
//                ((ArrayList) accreditations).add(myList1);
                postfields.setAccreditations(Arrays.asList(myList1));
            }

//adding physicalContacts Data
//            List<String> physicalcontacts = new ArrayList<>();
            String physical = (String) data.get("physicalContacts");
            String[] myList2 = physical.split(",");
            if (Arrays.stream(myList2).anyMatch(""::equals)) {
                postfields.setPhysicalContact(null);
            } else {
//                ((ArrayList) physicalcontacts).add(myList2);
                postfields.setPhysicalContact(Arrays.asList(myList2));
            }
//
//            physicalcontacts.add(physical);
//            postfields.setPhysicalContact(physicalcontacts);
        }

        Response jsonAsString = RestAssured
                .given()
                .port(port_number) // We have to specify the port number
                .header("Authorization", PASSWORD)
                .contentType(ContentType.JSON)
                .body(postfields)
                .when()
                .request(Method.POST, Endpoints.GET_EMPLOYEE)  // Change the end point
                .then()
//                    .statusCode(200)
                .extract()
                .response();

        if (jsonAsString.asString().contains("already taken"))
            Assert.fail("***DATA NOT UPDATED****\n" + postfields.ebaId + " " + postfields.name + " has already been taken. Please edit your data");

    }
}




