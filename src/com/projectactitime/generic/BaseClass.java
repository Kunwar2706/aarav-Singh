package com.projectactitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.projectactitime.pom.Homepage;
import com.projectactitime.pom.LoginPage;


public class BaseClass   {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
		  
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("login",true);
		FileLib l=new FileLib();
		String url = l.getPropertyData("url");
		String un = l.getPropertyData("username");
		String pw = l.getPropertyData("password");
		Thread.sleep(2000);
		driver.get(url);
		LoginPage p=new LoginPage(driver);
		
		p.setLogin(un, pw);
		Thread.sleep(2000);
		



	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		Homepage l=new Homepage(driver);
		//l.setLogout();
	}

}
