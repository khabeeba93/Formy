package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement modals=driver.findElement(By.xpath("/html/body/div/div/li[10]/a")) ;
        modals.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
        
        WebElement openmodal=driver.findElement(By.id("modal-button")) ;
        openmodal.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
      
        
        
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept(); // or alert.dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert was present.");
        }
      //  System.out.println("Alert text: " + alert.getText());
        

	}

}
