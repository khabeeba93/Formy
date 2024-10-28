package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
       
        WebElement checkbox=driver.findElement(By.xpath("/html/body/div/div/li[3]/a")) ;
        checkbox.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")) ;
        checkbox1.click();
        WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]")) ;
        checkbox2.click();
        WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")) ;
        checkbox3.click();

	}

}
