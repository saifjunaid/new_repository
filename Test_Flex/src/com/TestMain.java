package com;

import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.FlexUISelenium;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.FlexUISelenium;
import com.thoughtworks.selenium.Selenium;
public class TestMain {

	/**
	 * @param args
	 */
	 static Selenium selenium;
		private static FlexUISelenium flexUITester;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
		
			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://qtp-help.blogspot.com");
			selenium.start();
			while(selenium.isElementPresent("myInput"))
				Thread.sleep(1000);
			selenium.open("/2011/03/flex-example.html");
			flexUITester = new FlexUISelenium(selenium, "selenium_demo");
			while(selenium.isElementPresent("myInput"))
				Thread.sleep(1000);
			flexUITester.type("Gaurang").at("myInput");
			flexUITester.click("myButton");
			assertEquals("Gaurang", flexUITester.readFrom("myText"));
		}

}
