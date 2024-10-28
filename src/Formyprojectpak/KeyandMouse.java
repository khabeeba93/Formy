package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyandMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement keymouse=driver.findElement(By.xpath("/html/body/div/div/li[9]/a")) ;
        keymouse.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        //keyboard Actions
        WebElement fullname=driver.findElement(By.id("name")) ;
        fullname.sendKeys("Habeeba");
     // Press Enter key
       fullname.sendKeys(Keys.ENTER);
     // Press TAB key to move to the next element
       // actions.sendKeys(Keys.TAB).perform();

        // Perform a combination of keys (e.g., Ctrl + A to select all text)
       // actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        
     //Mouse Actions
        
        WebElement buttonelement = driver.findElement(By.id("button"));
        actions.moveToElement(buttonelement).click().perform();

        // Right-click (context-click)
        actions.contextClick(buttonelement).perform();

        // Double-click
       // actions.doubleClick(buttonelement).perform();

        // Click and hold
       // actions.clickAndHold(buttonelement).perform();
        
        
        
	}

}
