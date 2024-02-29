package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Driver;
import Page_Objects.HomePage;

public class TC_003_EMICalculatorValidation extends Driver {
	

	HomePage hp;
	
	@Test(priority=0)
	public void Menu() {
		
		 hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Calculator Present in menu ----------");

		hp.click_Menu();
		
	}
	
	@Test(priority=1)
	public void LoanCalculatorClick() {
		
		// hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Loan Calculator Present in menu ----------");

		hp.Loan_Calculator();
	}	
	
	
	@Test(priority=2)
	public void EMICalculatorTextValidating(){
		
		Driver.getLogger().info("********** Validating EMI Calculator Text **********");
		
		System.out.println();
		System.out.println("      Text that are Validating  present below     ");
		System.out.println();

		
		// hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		
	boolean t1=	hp.amount_text();
	boolean t3=	hp.Interest_text();
	boolean t5=	hp.Tenure_Text();
	boolean t7=	hp.Fees_Text();
	
	try {
	sa.assertEquals(t1,true,"Amount Text is not Visible");
	sa.assertEquals(t3,true,"Interest Rate Text is not Visible");
	sa.assertEquals(t5,true,"Loan Tenure Text is not Visible");
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
	
	@Test(priority=3)
	public void EMICalculatorTextBoxValidating() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Text Box  **********");

		// hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		
		boolean t2=	hp.Amount_Box();
		boolean t4=	hp.Interest_Box();
		boolean t6=	hp.Tenure_Box();
		boolean t8=	hp.Fees_Box();
		
		try {
		sa.assertEquals(t2,true,"Amount TextBox is not Working");
		sa.assertEquals(t4,true,"Interest Rate TextBox is not Working");
		sa.assertEquals(t6,true,"Loan Tenure TextBox is not Working");
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
	
	@Test(priority=4)
	public void YearToMonthCalculation() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Year To month Conversion **********");

		 // hp=new HomePage(driver);
		  SoftAssert sa= new SoftAssert();
		  
		    int a=hp.Tenure()*12;
			hp.Months();
			int b=hp.Tenure();
			
			try {
			sa.assertEquals(a,b,"Calculated Tenure Months And Expected Months Mismatched");
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
	public void EMICalculatorSliderValidating() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Slider **********");

	//	HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		
		boolean s1=	hp.EMICalculatorLoanAmountSliderCheck();
		boolean s2=	hp.EMICalculatorInterestSliderCheck();
		boolean s3=	hp.EMICalculatorTenureSliderCheck();
		boolean s4=	hp.EMICalculatorFeesSliderCheck();
		
		try {
		sa.assertEquals(s1,false,"Loan Amount Slider is not Working");
		sa.assertEquals(s2,false,"Interest Rate Slider is not Working");
		sa.assertEquals(s3,false,"Loan Tenure slider is not Working");
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