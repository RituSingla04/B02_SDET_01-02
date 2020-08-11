package Testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anonation {
	@BeforeSuite
	public void Driver()
	{
		System.out.println("Driver Code");
	}
	@AfterSuite 
	public void Close_Browser()
	{
		System.out.println("Close Browser Code");
	}
	@BeforeTest 
	public void Bef_Test()
	{
		System.out.println("Before Test");
	}
	@AfterTest 
	public void After_Test()
	{
		System.out.println("After Test");
	}
	@BeforeClass 
	public void Bef_Class()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod 
	void Bef_Method()
	{
		System.out.println("Before Method");
	}
	@AfterMethod 
	void After_Method()
	{
		System.out.println("After Method");
	}
	@AfterClass 
	public void After_Class()
	{
		System.out.println("After Class");
	}
			
	@Test
	public void Login()
	{
		System.out.println("Login code");
	}
	@Test
	public void ForgetPassword()
	{
		System.out.println("Forget password Code");
	}
	@Test
	public void Logout()
	{
		System.out.println("Logout code");
	}

}