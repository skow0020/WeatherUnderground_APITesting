package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.helpers.Helpers;
import cucumber.support.Query;
import org.json.JSONObject;

/**
 * Created by Colin on 2/28/2017.
 */
public class MyStepdefs {
    JSONObject jsonObject;
    Query query;

    @Given("^I want to make an API call \"([^\"]*)\"$")
    public void iWantToMakeAnAPICall(String requestURL) throws Throwable {
        query = new Query(requestURL);
    }

    @When("^I receive results$")
    public void iReceiveResults() throws Throwable {
        query.verifyResponseNotEmpty();
    }

    @Then("^I receive condition results$")
    public void iReceiveConditionResults() throws Throwable {
        query.setExpectedResult("1");
        query.verifyQueryResponse("response.features.conditions");
    }

    @Then("^I receive alert results$")
    public void iReceiveAlertResults() throws Throwable {
        query.setExpectedResult("1");
        query.verifyQueryResponse("response.features.alerts");
    }

    @Then("^I receive almanac results$")
    public void iReceiveAlmanacResults() throws Throwable {
        query.setExpectedResult("1");
        query.verifyQueryResponse("response.features.almanac");
    }

    @Then("^I receive astronomy results$")
    public void iReceiveAstronomyResults() throws Throwable {
        query.setExpectedResult("1");
        query.verifyQueryResponse("response.features.astronomy");
    }

    @Then("^I receive hurricane results$")
    public void iReceiveHurricaneResults() throws Throwable {
        query.setExpectedResult("1");
        query.verifyQueryResponse("response.features.currenthurricane");
    }

    private JSONObject features() throws Throwable {
        {
            JSONObject response = jsonObject.getJSONObject("response");
            return response.getJSONObject("features");
        }
    }

    @Then("^I receive a gif$")
    public void iReceiveAGif() throws Throwable {
        query.verifyGifResponse();
    }
}
