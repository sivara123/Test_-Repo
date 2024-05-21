package task24;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ProjectSpecification extends UtilityClass {

	ExtentSparkReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	String desc = "";
	String author = "";
	String catagory = "";
	
		@BeforeMethod
		public void launchbrowser() {
			
			launch();
			
			}
		
		@BeforeSuite
		public void startreport() {
			
			reporter = new ExtentSparkReporter("./TestNg.html");
		    extent = new ExtentReports();
			extent.attachReporter(reporter);
		}
		@BeforeClass
		public void createtest() {
			test = extent.createTest(desc);
			test.assignAuthor("author");
			test.assignCategory("catagory");
		}
		
		void stepreport(String status,String description) {
			switch (status.toLowerCase()) {
			case "pass":
				test.pass(description);
				break;
			case "fail":
				test.fail(description);
				break;
			case "warning":
				test.warning(description);
				break;
			case "info":
				test.info(description);
				break;
			default:
				System.err.println("Status is not defined");
				break;
			}
		}
	  @AfterMethod	
	  public void closebrowser() {
			
			close();
			
			}
	  
	  @AfterSuite
		public void endReport() {
			extent.flush();
		}
	  
	  
}
