package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;


import BaseClass.Driver;
import Page_Objects.HomePage;

public class TC_001_CarLoan extends Driver  {
	
	
	
	@Test(priority=1)
	public void Car_Loan() {
		
		HomePage hp=new HomePage(driver);
		
		Driver.getLogger().info("---------- Click on the Car Loan ----------");
		hp.CarLoan();
		
	}
	
	@Test(priority=2)
	public void Principal() throws IOException {
		
		Driver.getLogger().info("---------- Click on the Principal TextBox and fill amount ----------");

		
		HomePage hp=new HomePage(driver);
		hp.Principal();
	}
	
	@Test(priority=3)
	public void Interest() throws IOException {
		
		Driver.getLogger().info("---------- Click on Interest TextBox and fill Interest Rate ----------");

		HomePage hp=new HomePage(driver);
		hp.Interest();
	}
	
	@Test(priority=4)
	public void Loan_Tenure() throws IOException {
		
		Driver.getLogger().info("---------- Click on Tenure TextBox and Fill Year ----------");

		HomePage hp=new HomePage(driver);
		hp.LoanTerm();
		
	}
	
	@Test(priority=5)
	public void Months_details() {
		
		Driver.getLogger().info("---------- Fetching  Principal amount and Interest ----------");

		HomePage hp=new HomePage(driver);
		hp.Year2024();
		
	}
	
	@Test(priority=6)
	public void output() {
		
		HomePage hp=new HomePage(driver);
		Driver.getLogger().info("---------- Printing Principal amount and Interest in console ----------");

		
		String Principal =hp.Emi_Amount();
		String Interest=hp.Emi_Interest();
	System.out.println("Principal Amount : "+Principal);
	System.out.println("Interest Amount : "+Interest);
	
		
	}

}
