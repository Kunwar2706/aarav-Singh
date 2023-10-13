package com.projectactitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(id="logoutLink")
private WebElement lgoutbtn;

@FindBy(id="container_tasks")
private WebElement taskTab;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void  setLogout() {
		lgoutbtn.click();
	}
		
		public void setTaskTab() {
			taskTab.click();
		}
	}


