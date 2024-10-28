package Formyprojectpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifthik\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement button=driver.findElement(By.xpath("/html/body/div/div/li[2]/a")) ;
        button.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement Primary=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")) ;
        Primary.click();
        WebElement Success=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]")) ;
        Success.click();
        WebElement Info=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]")) ;
        Info.click();
        WebElement Warning=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]")) ;
        Warning.click();
        WebElement Danger=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]")) ;
        Danger.click();
        WebElement Link=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]")) ;
        Link.click();
        WebElement Left=driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]")) ;
        Left.click();
        WebElement Middle=driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]")) ;
        Middle.click();
        WebElement Right=driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]")) ;
        Right.click();
        WebElement one=driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]")) ;
        one.click();
        WebElement two=driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]")) ;
        two.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]")) ;
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        WebElement ddlink1=driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]")) ;
       // ddlink1.click();
        WebElement ddlink2=driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[2]")) ;
       // ddlink2.click();
	}

}
