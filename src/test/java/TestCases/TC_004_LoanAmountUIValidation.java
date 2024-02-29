package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Driver;
import Page_Objects.HomePage;

public class TC_004_LoanAmountUIValidation  extends Driver {
	
	
	
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
	public void Loan_Amount_Calculator_Click(){
		
		Driver.getLogger().info("---------- Click on the Loan Amount Calculator ----------");

		HomePage hp=new HomePage(driver);
		driver.navigate().refresh();
		
		hp.Amount_Calculator();
		
	}
	
	@Test(priority=3)
	public void LoanAmountCalculatorTextValidating(){
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Amount Calculator Text **********");


		System.out.println();
		System.out.println("      Text that are Validating  present below     ");
		System.out.println();
		
		boolean t1=	hp.Emi_text();
		boolean t3=	hp.Interest_text();
		boolean t5=	hp.Tenure_Text();
		boolean t7=	hp.Fees_Text();
		
		try {
		sa.assertEquals(t1,true,"Emi Text is not Visible");
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
	
	@Test(priority=4)
	public void LoanAmountCalculatorTextBoxValidating(){
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Amount Calculator Text Box **********");

		
		boolean t2=	hp.Emi_Box();
		boolean t4=	hp.Interest_Box();
		boolean t6=	hp.Tenure_Box();
		boolean t8=	hp.Fees_Box();
		
		try {
		sa.assertEquals(t2,true,"Emi TextBox is not Working");
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
	
	@Test(priority=5)
	public void LoanamountYearToMonth(){
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Amount Calculator Year To Month Conversion **********");

			
			//hp.Years();
		    int cal=hp.Tenure()*12;
			hp.Months();
			int exp=hp.Tenure();
			
			try {
			sa.assertEquals(cal,exp,"Calculated Tenure Months And Expected Months Mismatched");
			}
			
			catch(Exception e)
			{
				logger.error("test failed..");
				logger.debug("debug logs....");
				sa.fail();
			}
			
			sa.assertAll();
			
		}
	
	@Test(priority=6)
	public void LoanAmountCalculatorSliderValidating(){
		
		HomePage hp=new HomePage(driver);
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Amount Calculator Slider **********");

		
		boolean s1=	hp.loanAmountEMISliderCheck();
		boolean s2=	hp.EMICalculatorInterestSliderCheck();
		boolean s3=	hp.EMICalculatorTenureSliderCheck();
		boolean s4=	hp.EMICalculatorFeesSliderCheck();
		
		try {
		sa.assertEquals(s1,false,"EMI Slider is not Working");
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
