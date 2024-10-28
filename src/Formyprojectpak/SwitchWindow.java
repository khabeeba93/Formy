package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        driver.manage().window().maximize();
       WebElement SW=driver.findElement(By.xpath("/html/body/div/div/li[13]/a")) ;
       SW.click();
       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
     
     String originalWindow = driver.getWindowHandle();

  
     

    
     driver.findElement(By.id("new-tab-button")).click(); // Replace with actual link text or locator
    
 

    // Switch to new window
     for (String windowHandle : driver.getWindowHandles()) {
         if (!windowHandle.equals(originalWindow)) {
             driver.switchTo().window(windowHandle);
             break;
         }
     }    
    // Perform actions in the new window
        System.out.println("New window title: " + driver.getTitle());
        //return to orginal window
        driver.switchTo().window(originalWindow);     
         driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
       driver.findElement(By.id("alert-button")).click();
       System.out.println("New window title: " + driver.getTitle());
       Alert alert = driver.switchTo().alert();
       alert.accept();
        
       // driver.switchTo().window(originalWindow);  
     // Close the new window or perform any additional actions
   //  driver.close();

     

    
 }


	}


