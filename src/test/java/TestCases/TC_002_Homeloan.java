package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.Driver;
import Page_Objects.HomePage;


public class TC_002_Homeloan extends Driver {
	
	@Test(priority=1)
	public void Menu() {
		HomePage hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Calculator present in Menu ----------");

		hp.click_Menu();
		
	}
	
	@Test(priority=2)
	public void Home_Loan() {
		HomePage hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Home Loan Present in Menu ----------");

		hp.click_HomeLoan();
		System.out.println();
		System.out.println("2 Test Scenario");
		System.out.println();
	}
	
	@Test(priority=3)
	public void Home_Loan_Value() throws IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		Driver.getLogger().info("---------- Enter Details in home Loan ----------");

		hp.Home_Value();
		hp.Down_Payment();
		hp.Loan_amount();
		hp.Loan_Interest();
		hp.Loan_Tenure();
		hp.Loan_Fees();
		Thread.sleep(4000);
	}
	
	
	
	@Test(priority=4)
	public void Year_Wise_Print() {
		
		HomePage hp=new HomePage(driver);
		Driver.getLogger().info("---------- Printing Year Wise Table in console ----------");

		
		String[] Year=hp.Year_Wise();
		
		for(int i=0;i<Year.length;i++) {
			System.out.println(Year[i]);
		}
		System.out.println();
	}
	
	@Test(priority=5)
	public void Writing_Excel() {
		
		Driver.getLogger().info("---------- Writing Year Wise Table in Excel ----------");

		HomePage hp=new HomePage(driver);
		
		hp.excel();
		
		System.out.println("2 Test Scenario Completed");
		System.out.println();
	
	}
}