package runner;

import org.testng.annotations.DataProvider;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public abstract class AbstractTestNGCucumberParallelTests extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}