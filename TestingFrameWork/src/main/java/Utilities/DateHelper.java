package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

	public String getCurrentDate()
	{
		Date date = new Date();
		SimpleDateFormat dateformater= new SimpleDateFormat("dd-MMMM-yyyy");
		String dates = dateformater.format(date);
		System.out.println("Date is : "+dates);
		return dates;
	}
	public String getCurrentDay()
	{
		String date=getCurrentDate();
		String day=date.substring(0,2);
		System.out.println("Day"+day);
		return day;
	}
	public String getCurrentMonth()
	{
		String date=getCurrentDate();
		String month=date.substring(3,7);
		System.out.println("Month"+month);
		return month;	
	}
	public String getCurrentYear()
	{
		String date=getCurrentDate();
		String year=date.substring(8);
		System.out.println("Year"+year);
		return year;	
	}
	
}
