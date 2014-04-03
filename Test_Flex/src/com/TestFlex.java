package com;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.FlexUISelenium;
import com.thoughtworks.selenium.Selenium;
 
public class TestFlex {
	Selenium selenium;
	private FlexUISelenium flexUITester;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 2323, "*chrome", "http://qtp-help.blogspot.com");
		selenium.start();
		while(selenium.isElementPresent("myInput"))
			Thread.sleep(1000);
		selenium.open("/2011/03/flex-example.html");
		flexUITester = new FlexUISelenium(selenium, "selenium_demo");
	}

	@Test
	public void test() {
		//Enter text
		flexUITester.type("Gaurang").at("myInput");
		flexUITester.click("myButton");
		assertEquals("Gaurang", flexUITester.readFrom("myText"));
	}
}