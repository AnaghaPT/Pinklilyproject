package testpkg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Pinkloginpage;
import utilities.Excelutils;

public class PinkloginTest extends Baseclass {
	
	@Test
	public void verifyLoginwithvalidcred() throws Exception
	{
		Pinkloginpage pl=new Pinkloginpage(driver);
		
		String xl="\"C:\\\\Users\\\\USER\\\\Desktop\\\\Book7.Xlsx";
		String sheet="sheet1";
		int rowCount=Excelutils.getrowcount(xl,sheet);
		for (int i=1;i<=rowCount;i++);
		{
			String username=Excelutils.getcellvalue(xl,sheet,i,0);
   		 System.out.println("username="+username);
   		 String password=Excelutils.getcellvalue(xl,sheet,i,1);
   		 System.out.println("password="+password);
   		 
   		 pl.setValues(username, password);
   		 pl.clickLoginButton();
   	 }
		}
	}


