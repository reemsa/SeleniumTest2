package test;

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
	static WebDriver driver;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");

	}
	@After
	public void tearDown() throws Exception{
		
	}
    public void test(){
        // TODO Auto-generated method stub

        //String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";

        
    	driver=new FirefoxDriver();



        driver.get("http:\\www.facebook.com");


        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("reemyousef59@yahoo.com");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("681997");

        WebElement element3 = driver.findElement(By.id("u_0_q"));
        element3.click();

        System.out.println("Login");




        WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
        lstitem.click();

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Log Out")).click();

        System.out.println("Log out");
}
}
