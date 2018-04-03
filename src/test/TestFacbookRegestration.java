package test;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TestFacbookRegestration {
static WebDriver driver;
public static void main (String []ar) {
	System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	driver=new FirefoxDriver();
    driver.get("http:\\www.facebook.com");


    WebElement element1 = driver.findElement(By.id("email"));
    element1.sendKeys("reemyousef59@yahoo.com");

    WebElement element2 = driver.findElement(By.id("pass"));
    element2.sendKeys("Reem@681997");

    WebElement element3 = driver.findElement(By.id("u_0_2"));
    element3.click();

    System.out.println("Login");




   /* WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
    lstitem.click();

    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

    driver.findElement(By.partialLinkText("Log Out")).click();

    System.out.println("Log out");*/
}
}
