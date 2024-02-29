package stepDefinitions;

import java.io.IOException;

import BaseClass.Driver;
import TestCases.TC_001_CarLoan;
import TestCases.TC_002_Homeloan;
import TestCases.TC_003_EMICalculatorValidation;
import TestCases.TC_004_LoanAmountUIValidation;
import TestCases.TC_005_LoanTenureCalculatorUIVAlidation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMI_Calculate {
	
	TC_001_CarLoan t1;
	TC_002_Homeloan t2;
	TC_003_EMICalculatorValidation t3;
	TC_004_LoanAmountUIValidation t4;
	TC_005_LoanTenureCalculatorUIVAlidation t5;
	
@Given("User already on emicalculator Website")
public void user_already_on_emicalculator_website() throws InterruptedException, IOException {
    Driver d= new Driver();
	d.setup("windows", "chrome");
}

@When("User Click on Car Loan button")
public void user_click_on_car_loan_button() {
   
 t1= new TC_001_CarLoan();
	
	t1.Car_Loan();
   
}

@When("User filled amount in Car Loan Amount TextBox")
public void user_filled_amount_in_car_loan_amount_text_box()throws IOException  {
   
	t1.Principal();
	
}

@When("User filled Interest Rate in Interest Rate TextBox")
public void user_filled_interest_rate_in_interest_rate_text_box()throws IOException {
    
	t1.Interest();
	
}

@When("User filled Time Periood in Loan Tenure TextBox")
public void user_filled_time_periood_in_loan_tenure_text_box()throws IOException {
    
	t1.Loan_Tenure();
	
}

@Then("User click on Year to capture Months Details")
public void user_click_on_year_to_capture_months_details() {
    
	t1.Months_details();
}

@Then("User Print Output In console")
public void user_print_output_in_console() {
   
	t1.output();
}

@When("User Click on the calculator in the MenuBar")
public void user_click_on_the_calculator_in_the_menu_bar() {
   t2= new TC_002_Homeloan();
	t2.Menu();
}

@When("User Click on the Home Loan")
public void user_click_on_the_home_loan() {
   
	t2.Home_Loan();
}

@When("User Enter details")
public void User_Enter_details() throws IOException, InterruptedException {
    
	t2.Home_Loan_Value();
}

@Then("User Print Data in console")
public void user_print_data_in_console() {
    
	t2.Year_Wise_Print();
}

@Then("Write all the details in Excel Sheet")
public void write_all_the_details_in_excel_sheet() {
    
	t2.Writing_Excel();
}

@Given("User Click on the Calculator From Menu")
public void user_click_on_the_calculator_from_menu() {
    
	t3= new TC_003_EMICalculatorValidation();
	t3.Menu();
}


@When("User Click On the Loan Calculator")
public void user_click_on_the_loan_calculator() {

	t3.LoanCalculatorClick();
}

@Then("EMI Calculator Text Validation")
public void emi_calculator_text_validation() {
   
	t3.EMICalculatorTextValidating();
}

@Then("EMI Calculator TextBox validation")
public void emi_calculator_text_box_validation() {
    
	t3.EMICalculatorTextBoxValidating();
}

@Then("EMI Calculator Year To Month Conversion Validation")
public void emi_calculator_year_to_month_conversion_validation() {
	t3.YearToMonthCalculation();
}

@Then("EMI calculator Sliders Validation")
public void emi_calculator_sliders_validation() {
	
   t3.EMICalculatorSliderValidating();
}

@Given("User click on the Calculator From Menu")
public void user_Click_on_the_calculator_from_menu() {
    
	t4= new TC_004_LoanAmountUIValidation();
	t4.Menu();
}

@When("User Click on the Loan Calculator")
public void user_Click_on_the_loan_Calculator() {
   
	t4.LoanCalculatorClick();
}

@When("User Click on the Loan Amount Calculator")
public void user_click_on_the_loan_amount_calculator() {
   
	t4.Loan_Amount_Calculator_Click();
}

@Then("Loan Amount Calculator Text Validation")
public void loan_amount_calculator_text_validation() {
   
	t4.LoanAmountCalculatorTextValidating();
}

@Then("Loan Amount Calculator TextBox validation")
public void loan_amount_calculator_text_box_validation() {
    
	t4.LoanAmountCalculatorTextBoxValidating();
}

@Then("Loan Amount Calculator Year To Month Conversion Validation")
public void loan_amount_calculator_year_to_month_conversion_validation() {
    
	t4.LoanamountYearToMonth();
}

@Then("Loan Amount calculator Sliders Validation")
public void loan_amount_calculator_sliders_validation() {
   
	t4.LoanAmountCalculatorSliderValidating();
}

@Given("User click on the Calculator From MenuBar")
public void user_click_on_the_calculator_from_menu_bar() {
  
	t5= new TC_005_LoanTenureCalculatorUIVAlidation();
	t5.Menu();
}

@When("User click on the Loan Calculator")
public void user_click_on_the_loan_Calculator() {
   
	t5.LoanCalculatorClick();
}

@Then("User Click on the Loan Tenure Calculator")
public void user_click_on_the_loan_tenure_calculator() {
   
	t5.Loan_Tenure_Calculator_Click();
}

@Then("Loan Tenure Calculator Text Validation")
public void loan_tenure_calculator_text_validation() {
    t5.Loan_Tenure_Calculator_TextValidation();
}

@Then("Loan Tenure Calculator TextBox validation")
public void loan_tenure_calculator_text_box_validation() {
   
	t5.Loan_Tenure_Calculator_TextBox_Validation();
}

@Then("Loan Tenure calculator Sliders Validation")
public void loan_tenure_calculator_sliders_validation() {
    t5.Loan_Tenure_Calculator_Slider_Validation();
}


}
