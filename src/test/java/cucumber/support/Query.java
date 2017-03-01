package cucumber.support;

import org.junit.Assert;
import java.util.HashMap;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.path.json.JsonPath.from;


/**
 * Created by Colin on 2/28/2017.
 */
public class Query {
    private String apiCall;
    private String expectedResult;
    private String jsonToValidate;
    public Query(String apiCall)
    {
        this.apiCall = apiCall;
    }

    public String getApiCall() { return this.apiCall; }

    public void setExpectedResult(String expected) {
        this.expectedResult = expected;
    }

    public void verifyQueryResponse(String validationString)
    {
        this.jsonToValidate = validationString;
        String json = get(this.apiCall).asString();
        String result = from(json).get(jsonToValidate).toString();
        Assert.assertTrue("Query response did not return as expected for: " + validationString, result.equals(this.expectedResult));
    }

    public void verifyResponseNotEmpty(){
        String json = get(this.apiCall).asString();
        HashMap<String, String> responseMap = from(json).get("response");
        Assert.assertTrue("Response map did not return correctly", responseMap.size() == 3);
    }

    public void verifyGifResponse()
    {
        String json = get(this.apiCall).asString();
        Assert.assertTrue("GIF was not returned", json.startsWith("GIF"));
    }

}
