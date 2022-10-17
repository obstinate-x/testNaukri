package com.Naukri.Stepdef;



import com.Naukri.base.Browser;
import com.Naukri.pages.FirstSearchPage;
import com.Naukri.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {
	
	HomePage homepage = new HomePage();

	@Given("I naviagted to Website")
	public void i_naviagted_to_website() {
	  
		Browser.navigateToWebsite();
		
	}
	@When("I Enter {string} in skill field and {string} in location field and I search")
	public void i_enter_in_skill_field_and_in_location_field_and_i_search(String skill, String location) {
		
		homepage.enterSkill(skill); 
		homepage.enterLocation(location);
		homepage.submit();
				
	}
	
    @When("I select {string} for skill from the active element list")
    public void I_select_for_skill_from_the_active_element(String Element) {
    	    
    	homepage.selectElementForSkillField(Element);
    	
    }
    @And("{string} in location field from the active element list")
    public void bengaluru_in_location_field_from_the_active_element_list(String location){
    	
    	homepage.selectElementForLocationField(location);
    	
    	
    }
	@Then("I Should successfully see the job related page for {string}")
	public void i_should_successfully_see_the_job_related_page_for(String skill) {
	    
		FirstSearchPage firstsearchpage = new FirstSearchPage();		
		firstsearchpage.verifyTitle(skill);
	}




}
