package webtest.webtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class TestCerType {
	private static final String URL = "https://kyfw.12306.cn/otn/regist/init";
	static WebDriver driver = null;
	TestCerType a1 = null;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("passWord")).clear();
		driver.findElement(By.id("confirmPassWord")).clear();
		driver.findElement(By.name("loginUserDTO.name")).clear();
		driver.findElement(By.id("mobileNo")).clear();
		driver.findElement(By.id("cardCode")).clear();
		a1 = new TestCerType();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}

	public void test(String[] value) {

		Select s1 = new Select(driver.findElement(By.name("loginUserDTO.id_type_code")));
		s1.selectByVisibleText(value[4].trim());
		
		driver.findElement(By.id("userName")).sendKeys(value[0]);
		driver.findElement(By.id("passWord")).sendKeys(value[1]);
		driver.findElement(By.id("confirmPassWord")).sendKeys(value[2]);
		driver.findElement(By.name("loginUserDTO.name")).sendKeys(value[3]);
		driver.findElement(By.id("cardType")).click();

		driver.findElement(By.id("cardCode")).sendKeys(value[5]);
		driver.findElement(By.id("email")).sendKeys(value[6]);
		driver.findElement(By.id("mobileNo")).sendKeys(value[7]);
		new Select(driver.findElement(By.id("passengerType")))
				.selectByVisibleText(value[8].trim());
		if (value[9].equals("true")) {
			driver.findElement(By.id("checkAgree")).click();
		}

		driver.findElement(By.id("nextBtn")).click();

	}

	@Test
	public void test36() {
		String value[] = Strings.CASE_36.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test37() {
		String value[] = Strings.CASE_37.split(",");
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 10)
				fail("timeout");
			try {
				if (driver.findElement(By
						.id("content_defaultwarningAlert_hearder"))!=null)
					break;
			} catch (Exception e) {
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertTrue(driver
				.findElement(By.id("content_defaultwarningAlert_hearder"))
				.getText().toString().contains(value[10]));
	}

	@Test
	public void test38() {
		String value[] = Strings.CASE_38.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test39() {
		String value[] = Strings.CASE_39.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test40() {
		String value[] = Strings.CASE_40.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test41() {
		String value[] = Strings.CASE_41.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test42() {
		String value[] = Strings.CASE_42.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test43() {
		String value[] = Strings.CASE_43.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test44() {
		String value[] = Strings.CASE_44.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test45() {
		String value[] = Strings.CASE_45.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test46() {
		String value[] = Strings.CASE_46.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test47() {
		String value[] = Strings.CASE_47.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test48() {
		String value[] = Strings.CASE_48.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test49() {
		String value[] = Strings.CASE_49.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test50() {
		String value[] = Strings.CASE_50.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test51() {
		String value[] = Strings.CASE_51.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}

	@Test
	public void test52() {
		String value[] = Strings.CASE_52.split(",");
		a1.test(value);
		assertEquals(value[10],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
}