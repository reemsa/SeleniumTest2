package test;
//import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testfacebookwithjunt {
	 WebDriver driver;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.get("http:\\www.facebook.com");

	}
	
	@Test
    public void test(){
        // TODO Auto-generated method stub

        //String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";

        
    	//driver=new FirefoxDriver();
        driver.get("http:\\www.facebook.com");


        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("reemyousef59@yahoo.com");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("681997");

        WebElement element3 = driver.findElement(By.id("u_0_q"));
        element3.click();

        System.out.println("Login");

}
	@After
	public void tearDown() throws Exception{
		
	}
}
