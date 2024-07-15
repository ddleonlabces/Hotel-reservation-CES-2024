package henry.hotel;

import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@Tag("AcceptanceTests")
@IncludeEngines("cucumber")
@SelectClasspathResource("acceptance-features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "henry/hotel/acceptance/steps")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty, html:target/site/cucumber-pretty.html, json:target/cucumber.json")
public class CucumberAcceptanceTests {
}
