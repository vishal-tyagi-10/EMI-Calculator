package Page_Objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utilities.ExcelUtility;
import utilities.Reuse;



public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	} 
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Reuse r=new Reuse(driver);
	Actions act = new Actions(driver);
    String file_path = System.getProperty("user.dir") + ".\\Excel-data\\Excel.xlsx";
	ExcelUtility e = new ExcelUtility(file_path);
	
	@FindBy(xpath="//*[@id='car-loan']/a")
	WebElement CarLoan;
	
	@FindBy(xpath="//*[@id='loanamount']")
	WebElement Amount;
	
	@FindBy(xpath="//*[@id='loanamountslider']")
	WebElement AmountSlider;
	
	@FindBy(xpath="//*[@id='loaninterest']")
	WebElement InterestRate;
	
	@FindBy(xpath="//*[@id='loaninterestslider']")
	WebElement InterestRateSlider;
	
	@FindBy(xpath="//*[@id='loanterm']")
	WebElement LoanTenure;
	
	@FindBy(xpath="//*[@id='loantermslider']")
	WebElement LoanTenureSlider;
	

	@FindBy(xpath="//*//*[@id='emiarrears']")
	WebElement Arrears;
	
	@FindBy(xpath="//*[@id='year2024']")
	WebElement Year24;
	
	@FindBy(xpath="//tr[@id='monthyear2024']//tr[1]/td[2]")
	WebElement EmiAmount;

	@FindBy(xpath="//tr[@id='monthyear2024']//tr[1]/td[3]")
	WebElement EmiInterest;

	@FindBy(xpath="//*[@title='Calculators']")
	WebElement menu;
	
	@FindBy(xpath="//*[@title='Home Loan EMI Calculator']")
	WebElement HomeLoan;
	
	@FindBy(xpath="//*[@id='homeprice']")
	WebElement homeValue;
	
	@FindBy(xpath="//*[@id='downpayment']")
	WebElement homeDownPayment;
	
	@FindBy(xpath="//*[@id='homeloanamount']")
	WebElement homeLoanAmount;
	
	@FindBy(xpath="//*[@id='homeloaninterest']")
	WebElement homeLoaninterest;
	
	@FindBy(xpath="//*[@id='homeloanterm']")
	WebElement homeLoanTenure;
	
	
	@FindBy(xpath="//a[@title='Loan Calculator']")
	WebElement LoanCalculator;
		
	@FindBy(xpath="//*[@for='loanamount']")
	WebElement Loan_AmountText;

	@FindBy(xpath="//*[@for='loaninterest']")
	WebElement Loan_InterestText;

	
	@FindBy(xpath="//*[@for='loanterm']")
	WebElement Loan_TenureText;

	@FindBy(xpath="//*[@id='loanfees']")
	WebElement Loan_Fees;
	
	@FindBy(xpath="//*[@id='loanfeesslider']")
	WebElement Loan_FeesSlider;
	
	@FindBy(xpath="//label[@for='loanfees']")
	WebElement Loan_FeesText;
	
	@FindBy(xpath="//*[@id='loan-amount-calc']/a[1]")
	WebElement AmountCalculator;
	
	@FindBy(xpath="//*[@for='loanemi']")
	WebElement EmiText;
	
	@FindBy(xpath="//*[@id='loanemi']")
	WebElement Emi;
	
	@FindBy(xpath="//*[@id='loanemislider']//span")
	WebElement EmiSlider;
	
	@FindBy(xpath="//*[@id='loanmonths']")
	WebElement Months;
	
	@FindBy(xpath="//*[@id='loanyears']")
	WebElement Years;
	
	@FindBy(xpath="//*[@id='loan-tenure-calc']/a[1]")
	WebElement TenureCalculator;
	
	@FindBy(xpath="//*[@class='row no-margin yearlypaymentdetails']")
	List<WebElement> YearWisePrint;
	
	@FindAll(@FindBy(xpath="//td[@class='col-3 col-sm-2 col-lg-1 paymentyear toggle']"))
	List<WebElement> YearWise;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='col-3 col-sm-2 currency'][1]"))
	List<WebElement> Principal ;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='col-3 col-sm-2 currency'][2]"))
	List<WebElement> Interest ;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='col-3 col-lg-2 currency']"))
	List<WebElement> Tax ;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='d-none d-lg-table-cell col-lg-2 currency']"))
	List<WebElement> Total ;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='d-none d-sm-table-cell col-sm-3 col-lg-2 currency']"))
	List<WebElement> Balance ;
	
	@FindAll(@FindBy(xpath="//tr[@class='row no-margin yearlypaymentdetails']//td[@class='d-none d-lg-table-cell col-lg-1 paidtodateyear']"))
	List<WebElement> LoanPaid ;
	
	
	
	public void CarLoan() {
		r.Explicitwait(driver, CarLoan);
		CarLoan.click();
	}
	

	public void Principal() throws IOException {
		
		
		r.Explicitwait(driver, Amount);
		String a=e.getCellData("Sheet2", 1, 0);
	
		Amount.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Amount.sendKeys(Keys.DELETE);
		Amount.sendKeys(a);
	}
	
		public void Interest() throws IOException {
		InterestRate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		InterestRate.sendKeys(Keys.DELETE);
		String a=e.getCellData("Sheet2", 1, 1);
		InterestRate.sendKeys(a);
		//InterestRate.sendKeys("9.5");
		}
		
		public void LoanTerm() throws IOException {
		LoanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		LoanTenure.sendKeys(Keys.DELETE);
		String a=e.getCellData("Sheet2", 1, 2);
		LoanTenure.sendKeys(a);
		//LoanTenure.sendKeys("1");
		
		}
		
		public void Year2024() {
	  
		        js.executeScript("arguments[0].click();",Arrears);
		        js.executeScript("arguments[0].click();",Year24);
			}
		
		
		public String Emi_Amount() {

		String Loan= EmiAmount.getText();
		return Loan;
		}
		
		
		public String Emi_Interest() {

			String interest= EmiInterest.getText();
			
			return interest;
			}
		
		
		public void click_Menu(){
			r.Explicitwait(driver, menu);
			menu.click();
			
		}
		
		public void click_HomeLoan(){
			r.Explicitwait(driver, HomeLoan);
			HomeLoan.click();
		}
		
		public void Home_Value() throws IOException {
			homeValue.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			homeValue.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 0);
			homeValue.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		public void Down_Payment() throws IOException {
			homeDownPayment.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			homeDownPayment.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 1);
			homeDownPayment.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		public void Loan_amount() throws IOException {
			homeLoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			homeLoanAmount.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 2);
			homeLoanAmount.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		public void Loan_Interest() throws IOException {
			homeLoaninterest.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			homeLoaninterest.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 3);
			homeLoaninterest.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		public void Loan_Tenure() throws IOException {
			homeLoanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			homeLoanTenure.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 4);
			homeLoanTenure.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		public void Loan_Fees() throws IOException {
			Loan_Fees.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			Loan_Fees.sendKeys(Keys.DELETE);
			String a=e.getCellData("Sheet3", 1, 5);
			Loan_Fees.sendKeys(a);
			//InterestRate.sendKeys("9.5");
			}
		
		
		
		public String[] Year_Wise() {
			
			String[] arr= new String[YearWisePrint.size()]; 
			for(int i=0;i<YearWisePrint.size();i++) {
			arr[i]= YearWisePrint.get(i).getText();
			}
			return arr;
			}
		
		
		public void excel()  {
			
			r.ExplicitwaitList(driver, YearWise);
			
			String[] arr= new String[YearWise.size()]; 
			String[] arr1= new String[Principal.size()]; 
			String[] arr2= new String[Interest.size()]; 
			String[] arr3= new String[Tax.size()]; 
			String[] arr4= new String[Total.size()]; 
			String[] arr5= new String[Balance.size()]; 
			String[] arr6= new String[LoanPaid.size()]; 
			
			for(int i=0;i<YearWise.size();i++) 
			{
			
	     	 arr[i]=YearWise.get(i).getText();
		     arr1[i]=Principal.get(i).getText();
		     arr2[i]=Interest.get(i).getText();
		     arr3[i]=Tax.get(i).getText();
		     arr4[i]=Total.get(i).getText();
		     arr5[i]=Balance.get(i).getText();
		     arr6[i]=LoanPaid.get(i).getText();
			}
			
             r.YearTable(arr,arr1,arr2,arr3,arr4,arr5,arr6);
			
	        }
		

		public void Loan_Calculator() {
			
			r.Explicitwait(driver, LoanCalculator);
			LoanCalculator.click();
			
		     }
		
		
		
		public boolean amount_text() {
			r.Explicitwait(driver, Loan_AmountText);
			boolean Text1=Loan_AmountText.isDisplayed();
			System.out.println(Loan_AmountText.getText());
			return Text1;
			
			
		}

		public boolean Interest_text () {
			
			
			boolean Text2=Loan_InterestText.isDisplayed();
			System.out.println(Loan_InterestText.getText());
			return Text2;
			
			
		}
	  public boolean Emi_text () {
			
			boolean Text9=EmiText.isDisplayed();
			System.out.println(EmiText.getText());
			return Text9;
			
			
		}

		public boolean Tenure_Text() {
			
			boolean Text3=Loan_TenureText.isDisplayed();
			System.out.println(Loan_TenureText.getText());
			return Text3;
			
			
		}

		public boolean Fees_Text() {
			
			
			boolean Text4=Loan_FeesText.isDisplayed();
			System.out.println(Loan_FeesText.getText());
			return Text4;
			
			
		}

		public boolean Amount_Box() {
			
			boolean Text5=Amount.isEnabled();
			return Text5;
			
			
		}
	public boolean Emi_Box () {
			
			r.Explicitwait(driver, Emi);
			boolean Text10=Emi.isDisplayed();
			return Text10;
			
			
		}

		public boolean Interest_Box() {
			
			boolean Text6=InterestRate.isEnabled();
			return Text6;
			
			
		}

		public boolean Tenure_Box() {
			boolean Text7=LoanTenure.isEnabled();
			return Text7;
			
			
		}
		
		public int Tenure() {
			String Text=LoanTenure.getAttribute("value");
			int Month= Integer.parseInt(Text);
			return Month;
			
			
		}


		public boolean Fees_Box() {
			r.Explicitwait(driver,Loan_Fees );
			boolean Text8=Loan_Fees.isEnabled();
			return Text8;
			
		}
		
		public void Amount_Calculator() {
			r.Explicitwait(driver, AmountCalculator);
			AmountCalculator.click();
			
			
			
		}
		
		public void Tenure_Calculator() {
			r.Explicitwait(driver, TenureCalculator);
			TenureCalculator.click();
			
			
			
		}
		
		public void Months() {
			r.Explicitwait(driver, Months);
		    js.executeScript("arguments[0].click();",Months);
			
		
		}
		
		public void Years() {
			r.Explicitwait(driver, Years);
		    js.executeScript("arguments[0].click();",Years);
			
		
		}
		
		public boolean EMICalculatorLoanAmountSliderCheck() {
			String amount1=Amount.getAttribute("value");
			act.dragAndDropBy(AmountSlider, 20, 0).build().perform();
			String amount2 = Amount.getAttribute("value");
			boolean amount = amount1.equals(amount2);
			return amount;
		}
		
		public boolean EMICalculatorInterestSliderCheck() {
			String amount1=InterestRate.getAttribute("value");
			act.dragAndDropBy(InterestRateSlider, 20, 0).build().perform();
			String amount2 = InterestRate.getAttribute("value");
			boolean amount = amount1.equals(amount2);
			return amount;
		}
		public boolean EMICalculatorTenureSliderCheck() {
			String amount1=LoanTenure.getAttribute("value");
			act.dragAndDropBy(LoanTenureSlider, 20, 0).build().perform();
			String amount2 = LoanTenure.getAttribute("value");
			boolean amount = amount1.equals(amount2);
			return amount;
		}
		public boolean EMICalculatorFeesSliderCheck() {
			String amount1=Loan_Fees.getAttribute("value");
			act.dragAndDropBy(Loan_FeesSlider, 20, 0).build().perform();
			String amount2 = Loan_Fees.getAttribute("value");
			boolean amount = amount1.equals(amount2);
			return amount;
		}
		public boolean loanAmountEMISliderCheck() {
			String amount1=Emi.getAttribute("value");
			act.dragAndDropBy(EmiSlider, 20, 0).build().perform();
			String amount2 = Emi.getAttribute("value");
			boolean amount = amount1.equals(amount2);
			return amount;
		}

}
