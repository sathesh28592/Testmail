package Sample;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Runner {
	
	static ExtentReports report=new ExtentReports("D:/Testlab2018.html");
	static ExtentTest logger;
	
	public static void main(String [] args)
	{
		String a= args[0];
		if(a.contains("java"))
		{
			logger = report.startTest("Sam");
			logger.log(LogStatus.PASS, "Test Case Passed is report");
	
		}
		else
		{
			logger = report.startTest("sathesh");
			logger.log(LogStatus.FAIL, "Test Case Failed is report");
		}
		report.endTest(logger);
		report.flush();
		report.close();
	}
	

}
