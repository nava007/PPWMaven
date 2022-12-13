package com.runner;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		   //path of feature file
		   features = {"E:/Eclipsework/PPWMvnCucProject/testdata/com/featurefile/LoginPage.feature","E:/Eclipsework/PPWMvnCucProject/testdata/com/featurefile/HomePage.feature"},

		   //path of step definition file
		   glue ="",
		   plugin ={"pretty", 
						   "json:target/cucumber-reports/cucumber.json",
						   "html:target/cucumber-reports/cucumberreport.html",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunerClass extends AbstractTestNGCucumberTests {

}
