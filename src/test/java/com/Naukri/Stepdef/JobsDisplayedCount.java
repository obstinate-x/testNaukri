package com.Naukri.Stepdef;

import com.Naukri.pages.FirstSearchPage;

import io.cucumber.java.en.Then;

public class JobsDisplayedCount {
    
	FirstSearchPage firstsearchpage = new FirstSearchPage();
	
	@Then("The jobs posting available in the page should be {int}")
	public void the_jobs_posting_available_in_the_page_should_be(Integer expectedCount) {
	   
		
		firstsearchpage.job_Count();
		firstsearchpage.Verify_jobCount(expectedCount);
	}
	
	@Then("I should see the job titles")
	public void i_should_see_the_job_titles() {
		
		firstsearchpage.getJobTitles();
	   
	}
	
}
