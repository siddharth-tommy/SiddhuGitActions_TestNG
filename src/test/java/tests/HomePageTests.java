package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import helper.Browser;
import helper.TestHelper;
import org.testng.annotations.*;

/**
 * Created by opantsjoha on 02/07/2017.
 */
public class HomePageTests extends TestHelper {

//    Browser browser;
//
//    @BeforeMethod
//	@Parameters({"browserName", "https://github.com/siddharth-tommy/SiddhuGitActions_TestNG/edit/main/src/test/java/tests/HomePageTests.java"})
//    @BeforeClass(groups = {"web"})
//    public void setUp(String browserName, String baseUrl) {
//        browser = new Browser(browserName, baseUrl);
//        browser.navigateToBaseUrl();
//    }
//
//    @Test(groups = {"web"})
//    public void searchTest() throws InterruptedException {
//        browser.HomePage().HeaderSection().setSearchField("Cooking");
//        browser.HomePage().HeaderSection().clickOnSearchButton();
//        // todo: add assert
//    }
//
//    @AfterMethod
//	@AfterClass(groups = {"web"})
//    public void tearDown() {
//        browser._driver.quit();
//    }
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1 works...");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2 works...");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("testMethod3 works...");
	}

}
