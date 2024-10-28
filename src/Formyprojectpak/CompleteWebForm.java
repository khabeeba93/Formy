package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        driver.manage().window().maximize();
       WebElement CWF=driver.findElement(By.xpath("/html/body/div/div/li[14]/a")) ;
       CWF.click();
     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

     WebElement fname=driver.findElement(By.id("first-name"));
     fname.sendKeys("habeeba");
     WebElement lname=driver.findElement(By.id("last-name"));
     lname.sendKeys("k");
     WebElement job=driver.findElement(By.id("job-title"));
     job.sendKeys("Software Tester");
     WebElement hs=driver.findElement(By.id("radio-button-1"));
     hs.click();
     WebElement college=driver.findElement(By.id("radio-button-2"));
     college.click();
     WebElement gs=driver.findElement(By.id("radio-button-3"));
     gs.click();
     WebElement male=driver.findElement(By.id("checkbox-1"));
    // male.click();
     WebElement female=driver.findElement(By.id("checkbox-2"));
     female.click();
     WebElement other=driver.findElement(By.id("checkbox-3"));
    // other.click();
     Select YOE = new Select(driver.findElement(By.id("select-menu")));
    // YOE.selectByValue("0");
     YOE.selectByVisibleText("0-1");
   //  YOE.selectByVisibleText("2-4");
    // YOE.selectByVisibleText("5-9");
    // YOE.selectByVisibleText("10+");
     
     
     
     WebElement date=driver.findElement(By.id("datepicker"));
     date.sendKeys("11/5/2024");
     
     WebElement submit=driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
     submit.click();
     
   
     
	}

}
