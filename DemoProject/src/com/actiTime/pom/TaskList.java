package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addcstmer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdescription;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class ='emptySelection' ]")
	private WebElement custtype;
	
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcust;
	
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	

	public WebElement getAddcstmer() {
		return addcstmer;
	}

	

	public WebElement getCustname() {
		return custname;
	}

	

	public WebElement getCustdescription() {
		return custdescription;
	}

	

	public WebElement getCusttype() {
		return custtype;
	}

	

	public WebElement getOurcompany() {
		return ourcompany;
	}

	
	public WebElement getCreatecust() {
		return createcust;
	}

	
	
	

}
