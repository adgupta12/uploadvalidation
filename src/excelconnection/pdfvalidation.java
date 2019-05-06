package excelconnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pdfvalidation {
	
	 static Excelconnection ob;
	
	

	public static void main(String[] args) throws Throwable {
    try {
		System.setProperty("webdriver.chrome.driver", "D:\\\\ChromeDriver\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Validationpdf obj1 = new Validationpdf(driver);
	
		
		ob = new Excelconnection("D:\\pdfvalidationurls\\export_tridion_data_21_02_2019_09_42_33.xlsx",0);
		
		String ab=ob.excelread(2, 9);
		for(int i=2; i<=ob.lastRow();i++ ) {
			int j=9;
			int k=1;
			String tcmid = ob.excelread(i, k);
			String URL = ob.excelread(i,j);
			String[] suburl = URL.split("/");
			if(suburl[suburl.length-1].contains("pdf")) {
				driver.get(URL);
				driver.manage().window().maximize();
				Thread.sleep(2000);
			
				Boolean f =obj1.sampleTest();
				if(f) 
					{
					System.out.println(tcmid +": "+ "Download Succussfull" + "  "+"PDF");
					Filewrite.datasave(tcmid +": "+ "Download Succussfull" + "  "+"PDF", "C:\\Users\\dasgua\\eclipse-workspace\\excelconnection\\Pass");
					}
				
				else {
					System.out.println(tcmid +": "+"Download Failed" + "  "+"PDF");
					Filewrite.datasave(tcmid +": "+ "Download Failed" + "  "+"PDF", "C:\\Users\\dasgua\\eclipse-workspace\\excelconnection\\Fail");
					}
				
			}
			else {
				driver.get(URL);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				String filename = suburl[suburl.length-1];
				Boolean f = obj1.isFileDownloaded("C:\\Users\\dasgua\\Downloads",filename);
				if(f) {
					System.out.println(tcmid +": "+" Download Succussfull" + "  "+ "Non pdf");
				Filewrite.datasave(tcmid +": "+ "Download Succussfull" + "  "+"Non PDF", "C:\\Users\\dasgua\\eclipse-workspace\\excelconnection\\Pass");
				}
				else {
					System.out.println(tcmid +": "+" Download Failed" + "  "+"Non pdf");
					Filewrite.datasave(tcmid +": "+ "Download Failed" + "  "+"Non PDF", "C:\\Users\\dasgua\\eclipse-workspace\\excelconnection\\Fail");
				
			}
			
			}
			
		
		

		
		
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}


}
}