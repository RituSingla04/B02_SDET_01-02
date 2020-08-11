package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Dataprovider {

	@DataProvider(name="LoginData")
	public Object[][] demo()
	{
		Object[][] userdata=new Object[3][2];
		userdata[0][0]="admin";
		userdata[0][1]="ad";
		userdata[1][0]="admin";
		userdata[1][1]="ad123";
		userdata[2][0]="admin";
		userdata[2][1]="admin123";
		
		return userdata;
		
	}
	@Test(dataProvider="LoginData")
	public void Login(String uname,String pass)
	{
		System.out.println("username is:"+uname);
		System.out.println("password is:"+pass);
	}
	
}
