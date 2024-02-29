package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		//features= {"@target/rerun.txt"},

        features= ".//Feature_file",
        glue="stepDefinitions",
        plugin= {
        		"pretty", "html:reportsCucumber/myreport.html", 
        		"json:reportsCucumber/myreport.json",
        		"rerun:target/rerun.txt",   //Mandatory to capture failures  
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        		},  
  
      
        
                dryRun=false,    // checks mapping between scenario steps and step definition methods
				monochrome=true,   // to avoid junk characters in output
				publish=true ,  // to publish report in cucumber server
				
				
						tags="@sanity"  // this will execute scenarios tagged with @sanity
						//tags="@regression"
						//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
						//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
						//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
)


public class TestRun {

}
