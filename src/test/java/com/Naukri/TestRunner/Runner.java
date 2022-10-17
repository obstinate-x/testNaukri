package com.Naukri.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\Naukri\\features\\ActiveElement.feature"},
		glue = {"com.Naukri.utils", "com.Naukri.Stepdef"}
	
		)

public class Runner {

}
