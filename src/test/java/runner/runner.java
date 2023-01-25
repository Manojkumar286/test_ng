package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\insta\\com\\features",glue="insta.com.stepdefinition",tags = "@Insta",dryRun = false,
stepNotifications = true,plugin = {"html:target\\report\\Insta_login.html","json:target\\report\\Insta_login.json"},publish = true)


public class runner {
	
}
