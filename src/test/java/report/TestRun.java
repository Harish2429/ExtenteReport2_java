package report;

import base.BaseClass;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class TestRun extends BaseClass {

	@Test
	public void test1() {

		test = reports.createTest("loginTest").assignAuthor("Suraj");
		test.log(Status.INFO, "click on organization link");
		driver.findElement(By.linkText("Organizations")).click();

	}

	@Test
	public void test2() {
		test = reports.createTest("test2").assignAuthor("Sjn");
		test.info("Dry Run code");
		Assert.fail();
	}

	@Test
	public void test3() {
		test = reports.createTest("test3").assignAuthor("Kumar");
		throw new SkipException("Test3 got skipped");
	}

}
