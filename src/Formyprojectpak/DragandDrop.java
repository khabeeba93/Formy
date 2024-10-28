package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement DD=driver.findElement(By.xpath("/html/body/div/div/li[5]/a")) ;
       DD.click();
       driver.get("https://formy-project.herokuapp.com/dragdrop");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        
      //driver.switchTo().frame(0);
        
        WebElement source = driver.findElement(By.id("image"));
		WebElement target = driver.findElement(By.id("box"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//ac.clickAndHold(source).moveToElement(target).release().build().perform();
		
	}

}
