package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com");
        driver.manage().window().maximize();
       WebElement pagescrl=driver.findElement(By.xpath("/html/body/div/div/li[11]/a")) ;
       pagescrl.click();
        driver.get("https://formy-project.herokuapp.com/scroll");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        //scroll bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        //scroll top of the page
       //JavascriptExecutor js1 = (JavascriptExecutor) driver;
       // js1.executeScript("window.scrollTo(0, 0)");
	WebElement name=driver.findElement(By.id("name"));
	name.sendKeys("habeeba");
	WebElement date=driver.findElement(By.id("date"));
	date.sendKeys("11/03/2024");
	}

}
