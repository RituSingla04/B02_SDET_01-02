package Test;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart1 {
String path;
WebDriver driver;
public void add() throws InterruptedException
{
//STEP 1
path=System.getProperty("user.dir")+"//Driver//Chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);

//STEP 2
driver=new ChromeDriver();
//STEP 3
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();



 //To close the Login Popup
 Actions actions = new Actions(driver);
 actions.sendKeys(Keys.ESCAPE).build().perform();

 //To give input in Search bar and go to desired page
  driver.findElement(By.id("container")).sendKeys("Sanitizer");
 driver.findElement(By.className("vh79eN")).click();
 Thread.sleep(5000);

 ArrayList<WebElement> al = new ArrayList<WebElement>(driver.findElements(By.className("_2cLu-l")));
 for (int i=0;i<al.size();i++)
 {
 System.out.println(al.get(i).getText());
 }

 driver.quit();
}

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
Flipkart1 oo = new Flipkart1();
oo.add();

}
}