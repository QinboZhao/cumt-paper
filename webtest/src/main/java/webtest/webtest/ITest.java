package webtest.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webtest.webtest.Strings;

import org.junit.*;

import static org.junit.Assert.*;

public class ITest {
	private static final String URL = "https://kyfw.12306.cn/otn/regist/init";
	static WebDriver driver = null;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}

	public void test(String[] value) {

		driver.findElement(By.id("userName")).sendKeys(value[0]);
		driver.findElement(By.id("passWord")).sendKeys(value[1]);
		driver.findElement(By.id("confirmPassWord")).sendKeys(value[2]);
		driver.findElement(By.name("loginUserDTO.name")).sendKeys(value[3]);
		new Select(driver.findElement(By.id("cardType"))).selectByVisibleText(value[4]);
		driver.findElement(By.id("cardCode")).sendKeys(value[5]);
		driver.findElement(By.id("email")).sendKeys(value[6]);
		driver.findElement(By.id("mobileNo")).sendKeys(value[7]);
		new Select(driver.findElement(By.id("passengerType")))
				.selectByVisibleText(value[8]);
		if (value[9].equals("true")) {
			driver.findElement(By.id("checkAgree")).click();
		}
		driver.findElement(By.id("nextBtn")).click();
	}

	@Test
	public void test1() throws InterruptedException {
		String value[] = Strings.CASE_1.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 10)
				fail("timeout");
			try {
				if (driver.findElement(By.id("mobile_hy_dia_ok")) != null)
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		assertEquals(value[10], driver.findElement(By.id("mobile_hy_dia_ok"))
				.getText());
	}

	@Test
	public void test2() {
		String value[] = Strings.CASE_2.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10], driver.findElement(By.id("mobile_hy_dia_ok"))
				.getText());
	}

	@Test
	public void test3() {
		String value[] = Strings.CASE_3.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test4() {
		String value[] = Strings.CASE_4.split(";");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test5() {
		String value[] = Strings.CASE_5.split(";");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test6() {
		String value[] = Strings.CASE_6.split(";");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test7() {
		String value[] = Strings.CASE_7.split(";");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test8() {
		String value[] = Strings.CASE_8.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	//  未检测出
	@Test
	public void test9() {
		String value[] = Strings.CASE_9.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		try {
			assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void test10() {
		String value[] = Strings.CASE_10.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test11() {
		String value[] = Strings.CASE_11.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test12() {
		String value[] = Strings.CASE_12.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test13() {
		String value[] = Strings.CASE_13.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test14() {
		String value[] = Strings.CASE_14.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test15() {
		String value[] = Strings.CASE_15.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test16() {
		String value[] = Strings.CASE_16.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test17() {
		String value[] = Strings.CASE_17.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test18() {
		String value[] = Strings.CASE_18.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test19() {
		String value[] = Strings.CASE_19.split(";");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test20() {
		String value[] = Strings.CASE_20.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test21() {
		String value[] = Strings.CASE_21.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test22() throws InterruptedException {
		String value[] = Strings.CASE_22.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (driver.findElement(
								By.id("content_defaultwarningAlert_hearder"))!=null)
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		assertTrue(driver
				.findElement(By.id("content_defaultwarningAlert_hearder"))
				.getText().toString().contains(value[10]));
	}

	@Test
	public void test23() throws InterruptedException {
		String value[] = Strings.CASE_23.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if ((driver.findElement(By
						.id("content_defaultwarningAlert_hearder")).getText())
						.contains(value[10]))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		assertTrue(driver
				.findElement(By.id("content_defaultwarningAlert_hearder"))
				.getText().toString().contains(value[10]));
	}

	@Test
	public void test24() {
		String value[] = Strings.CASE_24.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test25() {
		String value[] = Strings.CASE_25.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test26() {
		String value[] = Strings.CASE_26.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test27() {
		String value[] = Strings.CASE_27.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		assertTrue(driver.findElement(By.cssSelector("label.error")).getText()
				.toString().contains(value[10]));
	}

	@Test
	public void test28() throws InterruptedException {
		String value[] = Strings.CASE_23.split(",");
		ITest a1 = new ITest();
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if ((driver.findElement(By
						.id("content_defaultwarningAlert_hearder")).getText())
						.contains(value[10]))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		assertTrue(driver
				.findElement(By.id("content_defaultwarningAlert_hearder"))
				.getText().toString().contains(value[10]));
	}
}
