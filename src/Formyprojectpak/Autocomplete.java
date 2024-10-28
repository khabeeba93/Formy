package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement autocomplete=driver.findElement(By.xpath("/html/body/div/div/li[1]/a")) ;
        autocomplete.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        WebElement address=driver.findElement(By.cssSelector("#autocomplete"));
        address.sendKeys("82A,Arafanagar");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement streetaddress=driver.findElement(By.xpath("//*[@placeholder='Street address']"));
        streetaddress.sendKeys("street1");
        WebElement streetaddress2=driver.findElement(By.id("route"));
        streetaddress2.sendKeys("south kalamasseri,kochi");
        WebElement city=driver.findElement(By.id("locality"));
        city.sendKeys("south kalamasseri");
        WebElement state=driver.findElement(By.id("administrative_area_level_1"));
        state.sendKeys("kerala");
        WebElement zipcode=driver.findElement(By.id("postal_code"));
        zipcode.sendKeys("6282025");
        WebElement country=driver.findElement(By.id("country"));
        country.sendKeys("india");
         
	}

}
