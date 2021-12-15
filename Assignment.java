package qualitest;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./onestar/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.qaclickacademy.com/practice.php");
	exerciseOne(driver);
	exerciseTwo(driver);
	exerciseThree(driver);
	exerciseFour(driver);
	exerciseFourPointTwo(driver);
	exerciseFive(driver);
	exerciseSix(driver);
	exerciseSeven(driver);
	exerciseEight(driver);
	exerciseNine(driver);
	}
	public static void exerciseOne(WebDriver driver) throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@value='radio1']")).click();
	System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='radio2']")).click();
	System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='radio3']")).click();
	System.out.println(driver.findElement(By.xpath("//input[@value='radio3']")).isSelected());
	Thread.sleep(2000);
	}
	public static void exerciseTwo(WebDriver driver) throws InterruptedException
	{
      driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
      Thread.sleep(2000);
      Actions act=new Actions(driver);
      act.sendKeys(Keys.DOWN).click().build().perform();
      act.sendKeys(Keys.ENTER).click().build().perform();
      driver.findElement(By.id("autocomplete")).clear();
      driver.findElement(By.id("autocomplete")).sendKeys("United States");
      Thread.sleep(2000);
      act.sendKeys(Keys.DOWN).perform();
      act.sendKeys(Keys.DOWN).click().build().perform();
      act.sendKeys(Keys.ENTER).click().build().perform();
	}
     /* driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
      Thread.sleep(2000);
      java.util.List<WebElement> n = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
      for(WebElement ele:n)
      {
    	  if(ele.getText().equalsIgnoreCase("United States Minor Outlying Island"))
    	  {
    		  
    		  ele.click();
    		  break;
    	  }
      }
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getText());
		}*/
	public static void exerciseThree(WebDriver driver) throws InterruptedException
	{
		WebElement dp=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(dp);
		s.selectByValue("option1");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option3");
	}
public static void exerciseFour(WebDriver driver) throws InterruptedException
{
	driver.findElement(By.xpath("//input[@value='option1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='option2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='option3']")).click();
	Thread.sleep(2000);
}
public static void exerciseFourPointTwo(WebDriver driver)
{
	WebElement check1=driver.findElement(By.xpath("//input[@value='option1']"));
	System.out.println(check1.isSelected());
	check1.click();
	WebElement check2=driver.findElement(By.xpath("//input[@value='option2']"));
	System.out.println(check2.isSelected());
	check2.click();
	WebElement check3=driver.findElement(By.xpath("//input[@value='option3']"));
	System.out.println(check3.isSelected());
	check3.click();
	
}
public static void exerciseFive(WebDriver driver) throws InterruptedException
{
	driver.findElement(By.id("openwindow")).click();
	System.out.println(driver.findElement(By.id("openwindow")).isDisplayed());
	 String windowHandlebefore=driver.getWindowHandle();
	 for( String windowhandle : driver.getWindowHandles())
	 {
		 driver.switchTo().window(windowhandle);
	 }
	 Thread.sleep(2000);
	 driver.close();
	 driver.switchTo().window(windowHandlebefore);
	 System.out.println(driver.findElement(By.id("openwindow")).getText());
	 }
public static void exerciseSix(WebDriver driver) throws InterruptedException
{
	System.out.println(driver.findElement(By.id("opentab")).isSelected());
	driver.findElement(By.id("opentab")).click();
	System.out.println(driver.findElement(By.id("opentab")).isDisplayed());
	String windowHandlebefore=driver.getWindowHandle();
	for(String windowHandle : driver.getWindowHandles())
	{
		driver.switchTo().window(windowHandle);
	}
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(windowHandlebefore);
	System.out.println(driver.findElement(By.id("opentab")).getText());
}
public static void exerciseSeven(WebDriver driver) throws InterruptedException
{
	driver.findElement(By.id("name")).sendKeys("John");
	Thread.sleep(2000);
	driver.findElement(By.id("alertbtn")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
}
public static void exerciseEight(WebDriver driver) throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,950);");
}
public static void exerciseNine(WebDriver driver) throws InterruptedException
{
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.id("mousehover"));
	act.moveToElement(ele).build().perform();
	Thread.sleep(2000);
	act.click().build().perform();
	WebElement ele1=driver.findElement(By.linkText("#top"));
	act.moveToElement(ele1);
	Thread.sleep(2000);
	act.click().build().perform();
}
}

	




