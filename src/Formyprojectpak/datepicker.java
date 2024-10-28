package Formyprojectpak;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        
        
            // Navigate to the HTML page with the datepicker
        	  WebElement datepicker1=driver.findElement(By.xpath("/html/body/div/div/li[4]/a")) ;
               datepicker1.click();
               
               driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
            // Click on the date input to open the datepicker
               WebElement dateInput=driver.findElement(By.xpath("//*[@id=\"datepicker\"]")) ;
               dateInput.click();
               driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
           // WebElement dateInput = driver.findElement(By.id("dateInput"));
          //  dateInput.click();

            // Wait for the datepicker to be visible
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='datepicker']")));

            // Select the desired month and year
            WebElement monthYear = driver.findElement(By.className("datepicker-switch"));
           // monthYear.click();
           
            // Navigate to the desired month (e.g., November 2024)
            
            WebElement nextMonthButton = driver.findElement(By.xpath("//*[text()='>>']"));
            nextMonthButton.click();

            
            
          /*  while (!monthYear.getText().equals("November 2024"))
           
            
            {
            	 WebElement nextMonthButton = driver.findElement(By.className("next"));
                 nextMonthButton.click();
           
                wait.until(ExpectedConditions.textToBePresentInElement(monthYear, "November 2024"));
                
            }*/
            WebElement dateToSelect = driver.findElement(By.xpath("//td[text()='28']"));
            dateToSelect.click();
            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
       
            
          
          /*  while (!monthYear.getText().equalsIgnoreCase("September 2024"))
            {
                WebElement prevMonthButton = driver.findElement(By.className("prev"));
                prevMonthButton.click();
              //  wait.until(ExpectedConditions.stalenessOf(monthYear));
                wait.until(ExpectedConditions.textToBePresentInElement(monthYear, "September 2024"));
                driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
            }
            */
          

	}
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    /*    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement datepicker2=driver.findElement(By.xpath("//*[@id=\"datepicker\"]")) ;
        datepicker2.click();
        WebElement year=driver.findElement(By.className("datepicker-switch")) ;
      year.click();
     //  td month = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
     //  month.selectByVisibleText("March");
      // Select year = new Select(driver.findElement(By.className("datepicker-switch")));
      // year.selectByVisibleText("1993");
      // WebElement day = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]"));
     //  day.click();*/

	}


