package com.Naukri.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Naukri.base.Base;



public class FirstSearchPage extends Base{
	
	
	public FirstSearchPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='f16 fw500']")
	private WebElement page_Title;
	
	@FindBy(tagName="article")
	private List<WebElement> jobavailable;
	
	@FindBy(xpath="//a[@class='title fw500 ellipsis']")
	private List<WebElement> Job_Titles;
	
	
	
	public void verifyTitle(String skill) {
		
		String actualPageTitle = page_Title.getText();
		if(actualPageTitle.contains(skill)) {
			System.out.println("Title contains text "+skill+" Test Passed");
		}else {
			
			System.out.println("Title doesnt not contains text"+skill+" Test Failed");
		}

}
	
	public int job_Count() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Time error");
		}
		int JobCount =  jobavailable.size();
		
			return JobCount;
		
	}
	
	public void Verify_jobCount(int expectedJobCount) {
		FirstSearchPage fsp = new FirstSearchPage();
		int actualjobcount = fsp.job_Count();
		
		if(actualjobcount == expectedJobCount) {
			System.out.println("The job count present in the page : "+actualjobcount+ "and it matches with the expected job count");
		}else {
			System.out.println("Test Failed:  Expected not match with Actual");
		}
	}
	
	public void getJobTitles() {
		
		for(int i=0; i>Job_Titles.size(); i++) {
			
			String text = Job_Titles.get(i).getText();
			System.out.println(text);
		}
		
		
	}
}
