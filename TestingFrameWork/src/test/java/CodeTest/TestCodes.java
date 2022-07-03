package CodeTest;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TestCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//Date date= new Date();
    	
    	String date = LocalDate.now().toString();
    	String curentDate = date.replace("-", "_");
		String path=System.getProperty("user.dir")+"\\ExtentReports\\spark"+curentDate+"_"+System.currentTimeMillis()+".html";
		System.out.println(path);
		System.out.println("month is"+LocalDate.now());
	}

}
