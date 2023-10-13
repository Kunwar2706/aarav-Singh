 package com.projectactitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.projectactitime.generic.BaseClass;
import com.projectactitime.generic.FileLib;
import com.projectactitime.pom.Homepage;
import com.projectactitime.pom.TaskListPage;
@Listeners(com.projectactitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void customer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("CustomerModule",true);
		FileLib fl=new FileLib();
		String exCustName = fl.getExcelData("createcustomer", 1, 2);
		Homepage h=new Homepage(driver);
		h.setTaskTab();



		TaskListPage t=new TaskListPage(driver);
		Thread.sleep(2000);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getEnterCustomertxBox().sendKeys("hdfc001");
		t.getEnterCustDes().sendKeys("banking project");
		t.getSelectCustDD().click();
		t.getSelectOurComDD().click();
		t.getClickCreateCust().click();

	}
}





