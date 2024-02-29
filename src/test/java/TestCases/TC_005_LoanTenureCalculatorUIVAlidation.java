package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Driver;
import Page_Objects.HomePage;

public class TC_005_LoanTenureCalculatorUIVAlidation  extends Driver{
	
	
	
	@Test(priority=0)
	public void Menu() {
		
		Driver.getLogger().info("---------- Click on the Calculators Present in menu ----------");

		HomePage hp=new HomePage(driver);
		hp.click_Menu();
		
	}
	
	@Test(priority=1)
	public void LoanCalculatorClick() {
		
		Driver.getLogger().info("---------- Click on the Loan Calculator Present in menu ----------");

		HomePage hp=new HomePage(driver);
		hp.Loan_Calculator();
	}	
	
	
	
	@Test(priority=2)
	public void Loan_Tenure_Calculator_Click() {
		
		Driver.getLogger().info("---------- Click on the Loan Tenure Calculator ----------");

		HomePage hp=new HomePage(driver);
		driver.navigate().refresh();
		hp.Tenure_Calculator();
	}
	
	@Test(priority=3)
	public void Loan_Tenure_Calculator_TextValidation() {
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Tenure Calculator Text **********");


		System.out.println();
		System.out.println("      Text that are Validating present below     ");
		System.out.println();
		
		boolean t1=	hp.amount_text();
		boolean t3=	hp.Emi_text();
		boolean t5=	hp.Interest_text();
		boolean t7=	hp.Fees_Text();
		
		try {
		sa.assertEquals(t1,true,"Amount Text is not Visible");
		sa.assertEquals(t3,true,"Emi Text is not Visible");
		sa.assertEquals(t5,true,"Interest Rate Text is not Visible");
		sa.assertEquals(t7,true,"Fees And Charges Text is not Visible");
		}
		
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			sa.fail();
		}
		
		sa.assertAll();
		
	}
	
	@Test(priority=4)
	public void Loan_Tenure_Calculator_TextBox_Validation() {
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Tenure Calculator Text Box  **********");

		
		boolean t2=	hp.Amount_Box();
		boolean t4=	hp.Emi_Box();
		boolean t6=	hp.Interest_Box();
		boolean t8=	hp.Fees_Box();
		
		try {
		sa.assertEquals(t2,true,"Amount TextBox is not Working");
		sa.assertEquals(t4,true,"Emi TextBox is not Working");
		sa.assertEquals(t6,true,"Interest Rate TextBox is not Working");
		sa.assertEquals(t8,true,"Fees And Charges TextBox is not Working");
		}
		
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			sa.fail();
		}
		
		sa.assertAll();
	}
	
	@Test(priority=5)
	public void Loan_Tenure_Calculator_Slider_Validation() {
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Tenure Calculator Slider **********");

		
		boolean s1=	hp.EMICalculatorLoanAmountSliderCheck();
		boolean s2=	hp.loanAmountEMISliderCheck();
		boolean s3=	hp.EMICalculatorInterestSliderCheck();
		boolean s4=	hp.EMICalculatorFeesSliderCheck();
		
		try {
		sa.assertEquals(s1,false,"Loan Amount Slider is not Working");
		sa.assertEquals(s2,false,"EMI Slider is not Working");
		sa.assertEquals(s3,false,"Interest Rate slider is not Working");
		sa.assertEquals(s4,false,"Fees Slider is not Working");
		}
		
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			sa.fail();
		}
		
		sa.assertAll();
		
	}
	

	

}
