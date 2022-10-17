Feature: Search Functioanlity

   Scenario Outline: Search with keyword
		Given I naviagted to Website
		When I Enter "selenium" in skill field and "bengaluru" in location field and I search
		Then I Should successfully see the job related page for "selenium"

   