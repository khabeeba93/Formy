package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement fileupload=driver.findElement(By.xpath("/html/body/div/div/li[8]/a")) ;
        fileupload.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"file-upload-field\"]"));
        choosefile.sendKeys("C:\\Users\\ifthik\\Downloads\\0b9beb82391bda5eb12d6b1c6ff96513(1) (1).pdf"); 
       // WebElement choose=driver.findElement(By.xpath("/html/body/div/form/div/div/span[1]/button"));
      // choose.sendKeys("C:\\Users\\ifthik\\Downloads\\0b9beb82391bda5eb12d6b1c6ff96513(1) (1).pdf"); 
        WebElement reset=driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button")) ;
       // reset.click();
	
	}

}
