package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,features="src\\test\\resources\\Features\\Login.feature",glue = "com.stepdefinition")
public class TestRunnerClass {

}
