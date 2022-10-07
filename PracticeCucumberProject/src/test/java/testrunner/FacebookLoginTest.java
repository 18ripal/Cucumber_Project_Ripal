package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_WorkSpace\\PracticeCucumberProject\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepDefinations"},//the path of the step definition files
		plugin= {"pretty"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		)




public class FacebookLoginTest {

}
