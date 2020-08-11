package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qualificationscript {
	String path;
	WebDriver driver;
	
	public void Launch() throws InterruptedException 
	{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 driver.findElement(By.linkText("Admin")).click();
	
	//Qualification
	driver.findElement(By.linkText("Qualifications")).click();
	
	//Languages
	driver.findElement(By.linkText("Languages")).click();
	
	// Add
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("language_name")).sendKeys("English");
	driver.findElement(By.id("language_name")).sendKeys("French");	
	driver.findElement(By.id("btnSave")).click();
	
    //Delete 
     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	if(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()==true)
	{
	System.out.println("successfull");
     }
	driver.findElement(By.id("btnDel")).click(); 
      
	 Thread.sleep(2000);
     driver.close();
  
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Qualificationscript oo=new Qualificationscript();
         oo.Launch();
	}
	
}