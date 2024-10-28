package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        driver.manage().window().maximize();
       WebElement RB=driver.findElement(By.xpath("/html/body/div/div/li[12]/a")) ;
       RB.click();
     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
     WebElement rb1=driver.findElement(By.id("radio-button-1"));
    // rb1.click();
     WebElement rb2=driver.findElement(By.xpath("//*[@value='option2']"));
     rb2.click();
     WebElement rb3=driver.findElement(By.xpath("//*[@value='option3']"));
    // rb3.click();
	}

}
