package WebTest;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import WebPage.ContestUs_Page;
import baselibrary.BaseLibrary;
import excelutility.DtataProvider;

public class ContestUs_Test extends BaseLibrary {

	
		ContestUs_Page ob;
		@BeforeTest
		public void getbrouser()
		{
			getlaunchururl("https://www.testingbaba.com/old/");
			ob =new ContestUs_Page();
		}
		
		@Test( dataProvider =  "data_reader" )
		public void callingdata(String name, String email,String mobile, String msg)
		{
			ob.namefillbaba();
			ob.emailfillbaba(email);
			ob.mobilenumberfill(mobile);
			ob.selecrservices();
			ob.massagefill(msg);
			
		}
		
		
		//static String path=System.getProperty("user.dir")+"/testdata/testingbabaform.xlsx";
		static String path="C:\\Users\\s10000116\\eclipse-workspace\\MavenProjectMay2023\\textdata\\testingbabaform.xlsx";
			//static String path=System.getProperty("user.dir")+"/textdata/testingbabafill.xlsx";
		
		    
		    @DataProvider(name = "data_reader")
		    
			public static Object[][] getData() throws IOException {
				//return excelDataReader(path,"Sheet1");
				
				Object [][]  data = DtataProvider.excelDataReader(path,"Sheet1");
				return data;
			}
		

}
