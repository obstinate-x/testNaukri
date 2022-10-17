Feature: Validating content on searched result

   Scenario: Validating the no. of jobs displayed in the page
     Given I naviagted to Website
	  	When I Enter "selenium" in skill field and "bengaluru" in location field and I search
	    Then The jobs posting available in the page should be 20
	    

	 Scenario: Validating job titles
	     Given I naviagted to Website
	  	When I Enter "selenium" in skill field and "bengaluru" in location field and I search
	    Then I should see the job titles