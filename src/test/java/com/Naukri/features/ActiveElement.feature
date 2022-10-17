 Feature: Search with active element
 
 
 Scenario Outline: Search with active element
   	  Given I naviagted to Website
			When I select "selenium Automation Testing" for skill from the active element list
			And  "bengaluru" in location field from the active element list
			Then I Should successfully see the job related page for "selenium"	
