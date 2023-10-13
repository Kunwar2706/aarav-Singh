package com.projectactitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;

@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement newCustBtn;

@FindBy(xpath = "//input[(@placeholder='Enter Customer Name') and @class]")
private WebElement enterCustomertxBox;

@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustDes;

@FindBy(xpath = "//div[text()='- Select Customer -'and @class='emptySelection']")
private WebElement selectCustDD;

@FindBy(xpath = "//div[text()='Our company'and @class='itemRow cpItemRow ']")
private WebElement selectOurComDD;

@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement clickCreateCust;

@FindBy(xpath = "//div[@class='titleEditButtonContainer' ]/div[@class='title']")
private WebElement actualCreateCutomTx;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustBtn() {
	return newCustBtn;
}

public WebElement getEnterCustomertxBox() {
	return enterCustomertxBox;
}

public WebElement getEnterCustDes() {
	return enterCustDes;
}

public WebElement getSelectCustDD() {
	return selectCustDD;
}

public WebElement getSelectOurComDD() {
	return selectOurComDD;
}

public WebElement getClickCreateCust() {
	return clickCreateCust;
}

public WebElement getActualCreateCutomTx() {
	return actualCreateCutomTx;
}


}
