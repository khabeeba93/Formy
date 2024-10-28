package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/"); // Replace with your URL
        WebElement EDelements=driver.findElement(By.xpath("/html/body/div/div/li[7]/a")) ;
        EDelements.click();
  	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        try {
           
            WebElement textField = driver.findElement(By.id("input")); // Replace with your element ID
            
            //  Disable the text field
            ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = true;", textField);
            System.out.println("Text field disabled.");

            //  Enable the text field
            
            
            WebElement textField2 = driver.findElement(By.id("disabledInput"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = false;", textField2);
            System.out.println("Text field enabled.");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the browser
           // driver.quit();
        }
	}

}
