package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features= "src/test/resources/Login/login.feature", 
glue = {"stepDefinitions"},
//tags = "@negative",
plugin = {"html:testoutput.html", "json:json_output/cucumber.json","junit:cucumber.xml"
		}
		)

public class Test_runner {
//This is runner class for cucumber
}
