package com.Satish.Satish;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	int countr=0,ret=4;
	public boolean retry(ITestResult results) {
		if(countr < ret)
		 {
			countr++;
		 return true;
		 }
		return false;
	}

}
