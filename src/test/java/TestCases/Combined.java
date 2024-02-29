package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Driver;

import Page_Objects.HomePage;

public class Combined extends Driver {
	
	HomePage hp;
	
	@Test(priority=1)
	public void Car_Loan() {
		hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Car Loan ----------");
		hp.CarLoan();
		
	}
	
	@Test(priority=2)
	public void Principal() throws IOException {
		
		Driver.getLogger().info("---------- Click on the Principal TextBox and fill amount ----------");


		hp.Principal();
	}
	
	@Test(priority=3)
	public void Interest()throws IOException {
		
		Driver.getLogger().info("---------- Click on Interest TextBox and fill Interest Rate ----------");

		hp.Interest();
	}
	
	@Test(priority=4)
	public void Loan_Tenure()throws IOException {
		
		Driver.getLogger().info("---------- Click on Tenure TextBox and Fill Year ----------");

		
		hp.LoanTerm();
		
	}
	
	@Test(priority=5)
	public void Months_details() {
		
		Driver.getLogger().info("---------- Fetching  Principal amount and Interest ----------");

		hp.Year2024();
		
	}
	
	@Test(priority=6)
	public void output() {
		
		
		Driver.getLogger().info("---------- Printing Principal amount and Interest in console ----------");

		
		String Principal =hp.Emi_Amount();
		String Interest=hp.Emi_Interest();
	System.out.println("Principal Amount : "+Principal);
	System.out.println("Interest Amount : "+Interest);
	
		
	}
	
	@Test(priority=7)
	public void menu() {
		
		Driver.getLogger().info("---------- Click on the Calculator present in Menu ----------");

		hp.click_Menu();
		
	}
	
	@Test(priority=8)
	public void Home_Loan() {
		
		Driver.getLogger().info("---------- Click on the Home Loan Present in Menu ----------");

		hp.click_HomeLoan();
		System.out.println();
		System.out.println("2 Test Scenario");
		System.out.println();
	}
	
	@Test(priority=9)
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
	
	
	
	@Test(priority=10)
	public void Year_Wise_Print() {
		
		Driver.getLogger().info("---------- Printing Year Wise Table in console ----------");

		
		String[] Year=hp.Year_Wise();
		
		for(int i=0;i<Year.length;i++) {
			System.out.println(Year[i]);
		}
		System.out.println();
	}
	
	@Test(priority=11)
	public void Writing_Excel() {
		
		Driver.getLogger().info("---------- Writing Year Wise Table in Excel ----------");

		
		hp.excel();
		
		System.out.println("2 Test Scenario Completed");
		System.out.println();
	
	}
	
	@Test(priority=12)
	public void Menu_() {
		
		 hp=new HomePage(driver);
		Driver.getLogger().info("---------- Click on the Calculator Present in menu ----------");

		hp.click_Menu();
		
	}
	
	@Test(priority=13)
	public void LoancalculatorClick() {
		
		
		Driver.getLogger().info("---------- Click on the Loan Calculator Present in menu ----------");

		hp.Loan_Calculator();
	}	
	
	
	@Test(priority=14)
	public void EMICalculatorTextValidating(){
		
		Driver.getLogger().info("********** Validating EMI Calculator Text **********");
		System.out.println();
		System.out.println("      Text that are Validating present below     ");
		System.out.println();

		
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
	
	@Test(priority=15)
	public void EMICalculatorTextBoxValidating() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Text Box  **********");

		
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
	
	@Test(priority=16)
	public void YearToMonthCalculation() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Year To month Conversion **********");

		 
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
	
	@Test(priority=17)
	public void EMICalculatorSliderValidating() {
		
		Driver.getLogger().info("********** Validating EMI Calculator Slider **********");

	
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
	
	@Test(priority=18)
	public void Menu_click() {
		
		Driver.getLogger().info("---------- Click on the Calculators Present in menu ----------");

		
		hp.click_Menu();
		
	}
	
	@Test(priority=19)
	public void LoanCalculatorclick() {
		
		Driver.getLogger().info("---------- Click on the Loan Calculator Present in menu ----------");

		
		hp.Loan_Calculator();
	}	
	
	@Test(priority=20)
	public void Loan_Amount_Calculator_Click(){
		
		Driver.getLogger().info("---------- Click on the Loan Amount Calculator ----------");

		
		driver.navigate().refresh();
		
		hp.Amount_Calculator();
		
	}
	
	@Test(priority=21)
	public void LoanAmountCalculatorTextValidating(){
		
		
		SoftAssert sa= new SoftAssert();
		Driver.getLogger().info("********** Validating Loan Amount Calculator Text **********");
		System.out.println();
		System.out.println("      Text that are Validating present below     ");
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
	
	@Test(priority=22)
	public void LoanAmountCalculatorTextBoxValidating(){
		
		
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
	
	@Test(priority=23)
	public void LoanamountYearToMonth(){
		
		
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
	
	@Test(priority=24)
	public void LoanAmountCalculatorSliderValidating(){
		
		
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
	
	@Test(priority=25)
	public void Menu() {
		
		Driver.getLogger().info("---------- Click on the Calculators Present in menu ----------");

		
		hp.click_Menu();
		
	}
	
	@Test(priority=26)
	public void LoanCalculatorClick() {
		
		Driver.getLogger().info("---------- Click on the Loan Calculator Present in menu ----------");

		
		hp.Loan_Calculator();
	}	
	
	
	
	@Test(priority=27)
	public void Loan_Tenure_Calculator_Click() {
		
		Driver.getLogger().info("---------- Click on the Loan Tenure Calculator ----------");

		
		driver.navigate().refresh();
		hp.Tenure_Calculator();
	}
	
	@Test(priority=28)
	public void Loan_Tenure_Calculator_TextValidation() {
		
		
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
	
	@Test(priority=29)
	public void Loan_Tenure_Calculator_TextBox_Validation() {
		
		
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
	
	@Test(priority=30)
	public void Loan_Tenure_Calculator_Slider_Validation() {
		
		
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
