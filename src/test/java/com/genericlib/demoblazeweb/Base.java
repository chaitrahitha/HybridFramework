package com.genericlib.demoblazeweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class Base{

		public static WebDriver driver;
		public FileLib fl=new FileLib();
		public String propPath="Test Data\\testdatas.properties";
		public CommonUtils cu = new CommonUtils();
		public static ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("test1-output/Extent.html");
		public static ExtentTest test;
		
		
		
		@BeforeTest
		public void configBT() {
			extent.attachReporter(spark);
			System.out.println("from Before Test");
			//ChromeOptions co = new ChromeOptions();
			//co.setBrowserVersion("116");
			
			//String browserPath = SeleniumManager.getInstance().getDriverPath(co, false).browserPath;
			//String driverPath = SeleniumManager.getInstance().getDriverPath(co, false).driverPath;
			//System.out.println(browserPath);
			//System.out.println(driverPath);
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String url = fl.getDataFromProperties(propPath, "URL");
			driver.get(url);			
		}
		
		@BeforeClass
		public void configBC() {
			System.out.println("from Before Class");			
		}
		
		@BeforeMethod
		public void configBM() { 
			System.out.println("from Before Method");
			driver.findElement(By.id("login2")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.id("loginusername")).sendKeys(fl.getDataFromProperties(propPath, "username"));
			driver.findElement(By.id("loginpassword")).sendKeys(fl.getDataFromProperties(propPath, "password"));
			driver.findElement(By.xpath("//button[text()='Log in']")).click();			
			try{
				Thread.sleep(3000);
			}catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			WebElement loggedInUser = driver.findElement(By.id("nameofuser"));			        
			String un = loggedInUser.getText();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Assert.assertTrue(un.contains(fl.getDataFromProperties(propPath, "username")));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		@AfterMethod
		public void configAM() {
			System.out.println("from After Method");
			driver.findElement(By.id("logout2")).click();
			try {
				driver.findElement(By.id("login2"));
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.out.println("Not logged out");
			}
		 }
		
		@AfterClass
		public void configAC() {
			System.out.println("from After Class");			
		}
		
		@AfterTest
		public void configAT() {
			System.out.println("from After Test");
			driver.quit();
		}
	}





	




