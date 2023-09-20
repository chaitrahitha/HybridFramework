package com.objectrepo.demoblazeweb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
		@FindBy(id = "cartur")
		private WebElement  cartLinkText;
		
		@FindBy(linkText = "About us")
		private WebElement aboutUsLinkText;

		@FindBy( xpath ="//button[@fdprocessedid='ocrnkf']")
		private WebElement clickOnClose;
		
		//getters
		public WebElement getCartLinkText() {
			return cartLinkText;
		}

		public WebElement getAboutUsLinkText() {
			return aboutUsLinkText;
		}
		
		public WebElement getClickOnClose() {
			return clickOnClose;
		}

	}
