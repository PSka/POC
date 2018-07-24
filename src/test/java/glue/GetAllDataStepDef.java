package glue;

import api.datatransfer.FilterlocalHostData;
import api.service.ReadAllLocalHostData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static com.google.common.truth.Truth.assertWithMessage;

public class GetAllDataStepDef {

    private final ReadAllLocalHostData readlocaldata;
    private FilterlocalHostData filterlocaldata;

    public GetAllDataStepDef() {
        readlocaldata = new ReadAllLocalHostData();
    }      //constructor

    @Given("^I request all the data from the service$")
    public void i_request_all_the_data_from_the_service() throws Throwable {

//        RestAssured
//                .given()
//                .contentType(ContentType.JSON)
//                .baseUri("http://localhost:3005")
//                .get("/employees")
//                .then()
//                .assertThat().statusCode(200);

        filterlocaldata = readlocaldata.getAllDemoData();
        filterlocaldata.getallcontacts();
    }

    @And("^I am able to talk to the service$")
    public void i_am_able_to_talk_to_the_service() throws Throwable {
        System.out.println("Able to talk to Service");
    }

    @Then("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" should match the expected$")
    public void should_match_the_expected(String id, String firstname, String lastname) throws Throwable {

        assertWithMessage("Expecting " + firstname + " to be in the search results")
                .that(filterlocaldata.getallname()
                        .contains(firstname));
        assertWithMessage("Expecting " + lastname + " to be in the search results")
                .that(filterlocaldata.getallname()
                        .contains(lastname));

    }
}
