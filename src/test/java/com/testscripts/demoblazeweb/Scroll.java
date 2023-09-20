package com.testscripts.demoblazeweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	@Test
	public void scollIntoView1() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.spinny.com/");
	WebElement quotes = driver.findElement(By.xpath("//a[text()='Get Instant Quotes']"));
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView();", quotes);
	Thread.sleep(3000);
	driver.quit();
	}
}