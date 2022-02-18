import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class test {
	WebDriver driver;
 
	@Test
  public void qatest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	  driver = new ChromeDriver();
	   String url = "http://localhost:3000";
	   driver.get(url);
	   WebElement AddUsersMenu=driver.findElement(By.xpath("//*[@href=\"/add\"]"));
	   AddUsersMenu.click();
	   Thread.sleep(2000);
	   WebElement EnterName=driver.findElement(By.xpath("//*[@name=\"name\"]"));
	   EnterName.sendKeys("Sanket Kulkarni");
	   Thread.sleep(2000);
	   WebElement EnterUserName=driver.findElement(By.xpath("//*[@name=\"username\"]"));
	   EnterUserName.sendKeys("sanketrkulkarni");
	   Thread.sleep(2000);
	   WebElement EnterEmail=driver.findElement(By.xpath("//*[@name=\"email\"]"));
	   EnterEmail.sendKeys("sanketkulkarni@gmail.com");
	   Thread.sleep(2000);
	   WebElement EnterPhoneNumber=driver.findElement(By.xpath("//*[@name=\"phone\"]"));
	   EnterPhoneNumber.sendKeys("1122334455");
	   Thread.sleep(2000);
	   WebElement AddNewUser=driver.findElement(By.xpath("//span[contains(text(),'Add User')]"));
	   AddUsersMenu.click();
	   Thread.sleep(2000);
	   WebElement CancelNewUser=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
	   CancelNewUser.click();
	   Thread.sleep(2000);
	   WebElement UsersMenu=driver.findElement(By.xpath("//*[contains(text(),'Users')]"));
	   UsersMenu.click();
	   Thread.sleep(2000);
	   WebElement DashboardMenu=driver.findElement(By.xpath("//*[contains(text(),' Home')]"));
	   DashboardMenu.click();
	   Thread.sleep(2000);
  }
  
	@BeforeMethod
	 public void beforeMethod() 
	{
	     System.out.println("Starting the browser session");
	 }
	
	@AfterMethod
	  public void afterMethod() {
        System.out.println("Closing the browser session");
	      driver.quit();
	  }


}
