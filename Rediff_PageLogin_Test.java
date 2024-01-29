package WebTest;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import WebPage.Rediff_PageLogin_Page;
import baselibrary.BaseLibrary;

public class Rediff_PageLogin_Test extends BaseLibrary {

	Rediff_PageLogin_Page ob;
	@BeforeTest
	public void gtlunch()
	{
		getlaunchururl("https://www.rediff.com/");
		ob=new Rediff_PageLogin_Page();
	}
	
	@Test
	public void createAccountclick()
	{
		ob.createAccountclick();
	}
}
