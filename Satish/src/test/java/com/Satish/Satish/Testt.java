package com.Satish.Satish;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testt {
	
	@Test(retryAnalyzer = com.Satish.Satish.RetryAnalyzer.class)
	public void test1()
	{
		Assert.assertEquals(true, true);
	}
	 @Test
	 public void test2()
	 {
	 Assert.assertEquals(false, true);
	 }

}
