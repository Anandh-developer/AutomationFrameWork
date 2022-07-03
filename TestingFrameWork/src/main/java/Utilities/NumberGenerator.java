package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class NumberGenerator {
	String path=System.getProperty("user.dir")+"\\PropertyFile\\number.properties";
	FileInputStream fis;
	FileOutputStream fout;
	Properties porperties;
	public int numberIncrementor() throws IOException
	{
		fis= new FileInputStream(path);
		
		porperties= new Properties();
		porperties.load(fis);
		String number = porperties.getProperty("Number");
		int num=Integer.parseInt(number);
		num=num+1;
		String strNum=Integer.toString(num);
		
		fis.close();
		fout= new FileOutputStream(path);
		porperties.setProperty("Number", strNum);
		porperties.store(fout, strNum);
		fout.close();
		return num;
	}
	

}
