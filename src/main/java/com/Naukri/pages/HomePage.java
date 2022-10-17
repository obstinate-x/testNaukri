package com.Naukri.pages;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Naukri.base.Base;

public class HomePage extends Base{
	
	public HomePage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Enter skills / designations / companies']")
	private WebElement skill_Field;
	
	@FindBy(xpath="(//input[@class='suggestor-input '])[2]")
	private WebElement location_Field;
	
	@FindBy(className="qsbSubmit")
	private WebElement submit;
	
	@FindBy(xpath="//li[@class='tuple-wrap']")
	private List<WebElement> Skill_active_element;
	
	@FindBy(xpath="//li[@class='tuple-wrap']")
	private List<WebElement> Location_Skill_Element;
	
	//methods	
	public void enterSkill(String skill) {
		skill_Field.sendKeys(skill);		
	}	
	public void enterLocation(String location) {
		location_Field.sendKeys(location);	
	}
	public void submit() {	
		submit.click();	
	}	
	public void selectElementForSkillField(String skill) {
		enterSkill(skill);
		Skill_active_element.stream().filter(s->s.getText().equalsIgnoreCase(skill)).forEach(s->s.click());				
	}
	public void selectElementForLocationField(String Location) {
		Location_Skill_Element.stream().filter(s->s.getText().equalsIgnoreCase(Location)).forEach(s->s.click());	
		
	}






















	

}
