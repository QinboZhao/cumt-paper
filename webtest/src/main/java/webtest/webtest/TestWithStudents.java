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

public class TestWithStudents {
	private static final String URL = "https://kyfw.12306.cn/otn/regist/init";
	static WebDriver driver = null;
	TestWithStudents a1 = null;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		a1 = new TestWithStudents();
	}

	@After
	public void tearDown() throws Exception {
		 driver.close();
	}

	public void test(String[] value) {
		driver.findElement(By.id("userName")).sendKeys(value[0]);
		driver.findElement(By.id("passWord")).sendKeys(value[1]);
		driver.findElement(By.id("confirmPassWord")).sendKeys(value[2]);
		driver.findElement(By.name("loginUserDTO.name")).sendKeys(value[3]);
		new Select(driver.findElement(By.id("cardType")))
				.selectByVisibleText(value[4].trim());
		driver.findElement(By.id("cardCode")).sendKeys(value[5]);
		driver.findElement(By.id("email")).sendKeys(value[6]);
		driver.findElement(By.id("mobileNo")).sendKeys(value[7]);
		new Select(driver.findElement(By.id("passengerType")))
				.selectByVisibleText(value[8].trim());
		new Select(driver.findElement(By.id("province_code")))
				.selectByVisibleText(value[9].trim());
		if(!value[10].trim().equals("")){
		driver.findElement(By.id("schoolNameText")).click();
		driver.findElement(By.id("schoolNameText")).clear();
		driver.findElement(By.id("schoolNameText")).sendKeys(value[10]);
		if (driver.findElement(By.linkText("中国矿业大学（徐州）")) != null) {
			driver.findElement(By.linkText("中国矿业大学（徐州）")).click();
		}
		}
		driver.findElement(By.name("studentInfoDTO.department")).sendKeys(
				value[11]);
		driver.findElement(By.name("studentInfoDTO.school_class")).sendKeys(
				value[12]);
		driver.findElement(By.name("studentInfoDTO.student_no")).sendKeys(
				value[13]);
		new Select(driver.findElement(By.id("school_system")))
				.selectByVisibleText(value[14]);
		new Select(driver.findElement(By.id("enter_year")))
				.selectByVisibleText(value[15]);
		driver.findElement(By.name("studentInfoDTO.preference_card_no"))
				.sendKeys(value[16]);
		driver.findElement(By.id("preference_from_station_name")).sendKeys(
				value[17]);
		driver.findElement(By.id("preference_to_station_name")).sendKeys(
				value[18]);
		if (value[19].equals("true")) {
			driver.findElement(By.id("checkAgree")).click();
		}
		driver.findElement(By.id("nextBtn")).click();
	}

	@Test
	public void test29() throws InterruptedException {
		String value[] = Strings.CASE_29.split(",");
		a1.test(value);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (driver.findElement(By.id("mobile_hy_dia_ok")) != null)
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		assertEquals(value[20], driver.findElement(By.id("mobile_hy_dia_ok"))
				.getText());
	}
	
	@Test
	public void test30() {
		String value[] = Strings.CASE_30.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
	
	@Test
	public void test31() {
		String value[] = Strings.CASE_31.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
	@Test
	public void test32() {
		String value[] = Strings.CASE_32.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
	@Test
	public void test33() {
		String value[] = Strings.CASE_33.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
	@Test
	public void test34() {
		String value[] = Strings.CASE_34.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
	@Test
	public void test35() {
		String value[] = Strings.CASE_35.split(",");
		a1.test(value);
		assertEquals(value[20],
				driver.findElement(By.cssSelector("label.error")).getText());
	}
}
