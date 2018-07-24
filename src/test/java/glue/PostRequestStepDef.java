package glue;

import api.datatransfer.FilterlocalHostData;
import api.service.PostLocalHostData;
import api.service.ReadAllLocalHostData;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PostRequestStepDef {

    private final ReadAllLocalHostData rjsondata;
    private FilterlocalHostData fjsondata;

    public PostRequestStepDef() {
        rjsondata = new ReadAllLocalHostData();
    }      //constructor

    @Given("^I add new data to the list for the tpp project$")
    public void iAddNewDataToTheListForTheTppProject(DataTable tableData ) throws Throwable {
        PostLocalHostData post = new PostLocalHostData();
        post.PostData(tableData);
    }

    @Then("^validate the get request$")
    public void validateTheGetRequest() throws Throwable {


    }
}
