package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	String path;
	WebDriver driver;
public void Launch() throws InterruptedException
{
path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	//Static path of Chromedriver
	System.setProperty("webdriver.chrome.driver", path);
	
	//Step 2
	//Initialize the ChromeDriver
	driver=new ChromeDriver();
	//Deleting Cookies
	driver.manage().deleteAllCookies();
	//Step 3
	//Provide url of the application through navigate method and we can move back  and forward,refresh pages throgh navigate p
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.navigate().refresh();
	//Open Application in Maximize mode
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	//Quitting Browser Window
	
	driver.quit();
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Navigate oo=new Navigate();
		oo.Launch();
	}

}
