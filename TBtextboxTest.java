package WebTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPage.TBtextboxPage;
import baselibrary.BaseLibrary;

public class TBtextboxTest extends BaseLibrary {
	
	TBtextboxPage ob;
	@BeforeTest
	public void getbrowser()
	{
		getlaunchururl("https://www.testingbaba.com/old/");
		ob=new TBtextboxPage();
	}
	
	
	
	@Test(priority =  1)
	public void cliconelements()
	{
		ob.cliconelements();
	}
	
	@Test(priority =  2)
	public void clicontextbox()
	{
		ob.clicontextbox();
	}
	
	@Test(priority =  3)
	public void filldetails()
	{
		ob.filldetails();
	}

}
