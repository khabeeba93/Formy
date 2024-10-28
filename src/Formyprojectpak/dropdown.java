package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement DDown=driver.findElement(By.xpath("/html/body/div/div/li[6]/a")) ;
        DDown.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement DDbutton=driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")) ;
        DDbutton.click();
        WebElement autocomplete=driver.findElement(By.xpath("//*[@id=\"autocomplete\"] ")) ;
        autocomplete.click();
         driver.navigate().back();
         DDbutton.click();
        
      /*  WebElement button=driver.findElement(By.xpath("/html/body/div/div/div/a[2]")) ;
        button.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        WebElement checkbox=driver.findElement(By.xpath("/html/body/div/div/div/a[3]")) ;
        checkbox.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement datepicker=driver.findElement(By.xpath("/html/body/div/div/div/a[4]")) ;
        datepicker.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement dd=driver.findElement(By.xpath("/html/body/div/div/div/a[5]")) ;
        dd.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement ddown=driver.findElement(By.xpath("/html/body/div/div/div/a[6]")) ;
        ddown.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement EDelements=driver.findElement(By.xpath("/html/body/div/div/div/a[7]")) ;
        EDelements.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement fileup=driver.findElement(By.xpath("/html/body/div/div/div/a[8]")) ;
        fileup.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement filedwld=driver.findElement(By.xpath("/html/body/div/div/div/a[9]")) ;
        filedwld.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement keymouse=driver.findElement(By.xpath("/html/body/div/div/div/a[10]")) ;
        keymouse.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement model=driver.findElement(By.xpath("/html/body/div/div/div/a[11]")) ;
        model.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement ps=driver.findElement(By.xpath("/html/body/div/div/div/a[12]")) ;
        ps.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement rb=driver.findElement(By.xpath("/html/body/div/div/div/a[13]")) ;
        rb.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();
        
        WebElement sw=driver.findElement(By.xpath("/html/body/div/div/div/a[14]")) ;
        sw.click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        DDbutton.click();*/
        
        WebElement cwf=driver.findElement(By.xpath("/html/body/div/div/div/a[15]")) ;
        cwf.click();
	}

}
