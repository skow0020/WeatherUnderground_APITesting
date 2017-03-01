package cucumber.support;

import cucumber.api.cli.Main;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Colin on 2/28/2017.
 */

//WUNDERGROUND API KEY: 215e564cbbcf82d2
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\cucumber\\features",
        plugin={"pretty", "html:target/cucumber"},
        glue = {"cucumber.steps",
                "cucumber.support"},
        tags = {})
public class CucumberRunner {

}

