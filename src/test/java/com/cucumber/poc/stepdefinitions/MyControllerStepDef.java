package com.cucumber.poc.stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyControllerStepDef {

	public MyControllerStepDef() throws IOException {
		super();
	}

	@Given("^user has two values to add$")
	public void user_has_sample_request_for_get_contract_service() throws Throwable {
		System.out.println("In Given");
	}

	@When("^user add two values$")
	public void get_contract_edit_service_called_via_postman() throws Throwable {
		System.out.println("In When");
	}

	@Then("^answer should be returned by adding two values$")
	public void get_contract_receives_status_code_of_200() throws Throwable {
		System.out.println("In Then");
	}
}
