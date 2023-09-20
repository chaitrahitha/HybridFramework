package com.testscripts.demoblazeweb;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericlib.demoblazeweb.Base;
import com.listeners.demoblazeweb.EventList;

@Listeners(EventList.class)

public class Login extends Base {
	
	@Test
	public void Demo() {
		test = extent.createTest("demo");
		test.pass("executed demo");
		test.skip("skip");
		test.warning("warning");
		test.fail("fail");
		test.info("info");
	}
	
	/*@Test
	public void scollDown() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bbc.com/");
		WebElement browse = driver.findElement(By.xpath("//nav[@class='international']/descendant::li[@class='orb-nav-newsdotcom']/descendant::span"));
		Point loc = browse.getLocation();
		int y = loc.getY();
		System.out.println(y);
	
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	@Test
	public void validCerdentialsTest() {
		test = extent.createTest("vaild ceredentails");

		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys(fl.getDataFromProperties(propPath, "username"));
		driver.findElement(By.id("loginpassword")).sendKeys(fl.getDataFromProperties(propPath, "password"));
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	@Test
	public void invalidCerdentialsTest() {
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("user");
		driver.findElement(By.id("loginpassword")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alt = driver.switchTo().alert();
		alt.accept();
	
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		

	}
	
	@Test
	public void emptyCerdentialsTest() {
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
	
	@Test
	public void invalidPasswordTest() {
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys(fl.getDataFromProperties(propPath, "username"));
		driver.findElement(By.id("loginpassword")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

	}
	
	@Test
	public void invalidUsernameTest() {
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("user");
		driver.findElement(By.id("loginpassword")).sendKeys(fl.getDataFromProperties(propPath, "password"));
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

	}*/


}
