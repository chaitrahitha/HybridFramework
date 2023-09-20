package com.testscripts.demoblazeweb;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericlib.demoblazeweb.Base;
import com.listeners.demoblazeweb.EventList;
import com.objectrepo.demoblazeweb.HomePage;

@Listeners(EventList.class)
public class AddToCart extends Base{
	/*@Test
	public void addToCartTest() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void clickOnCartTest() {
		driver.findElement(By.id("cartur")).click();
	}
	
	@Test
	public void clickOnPlaceOrder() {
		driver.findElement(By.id("cartur")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}*/
	
	@Test
	public void addToCartTest1() {
		test = extent.createTest("Add product to cart");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		cu.clickOnProduct("Nokia lumia 1520", driver);
		test.pass("Clicked on the product");
		try {
			cu.addToCartButton("Nokia lumia 1520", driver);
			System.out.println("Test Scripts Passed");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.out.println("Test Scripts failed");
			test.fail("Test Script Failed");
		}
		cu.addToCartButton("Nokia lumia 1520", driver).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		test.pass("Handled alert");
		test.pass("Added tp cart");
		//Assert.fail();
		//cu.clickOnCartButton("Nokia lumia 1520", driver);
		//cu.captureScreenshot(driver);
		//hp.getAboutUsLinkText().click();
		//hp.getClickOnClose().click();
		hp.getCartLinkText().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
