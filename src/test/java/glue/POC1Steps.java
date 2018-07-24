package glue;

import api.datatransfer.FilterlocalHostData;
import api.service.ReadAllLocalHostData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;

public class POC1Steps {

    private final ReadAllLocalHostData readAllLocalHostData;
    private FilterlocalHostData filterlocaldata,test;

    public POC1Steps() {
        readAllLocalHostData = new ReadAllLocalHostData();
    }      //constructor

    @Given("^I have a running service$")
    public void iHaveARunningService() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // Do Nothing
    }

    @When("^I request count of records from the service$")
    public void i_request_all_the_data_from_the_service() throws Throwable {

        filterlocaldata = readAllLocalHostData.getAllDemoData();
        filterlocaldata.getallcontacts().size();
        test = readAllLocalHostData.getAllData();
        System.out.println(filterlocaldata.getallcontacts().size());
    }

    @Then("^the correct no of records are returned$")
    public void i_am_able_to_talk_to_the_service() throws Throwable {
        System.out.println("Able to talk to Service");
        Assert.assertEquals(12, filterlocaldata.getallcontacts().size());

    }
}
