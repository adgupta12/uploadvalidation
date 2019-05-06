package excelconnection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Datenew {

	public static void main(String[] args) {
	
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasgua\\eclipse-workspace\\myfirsthybridframework\\Drivers\\chromedriver.exe");
   // WebDriver driver = new ChromeDriver();
		String str =null;
        
        ArrayList<String> arlTest = new ArrayList<String>();
        
        arlTest.add("K");
        arlTest.add("A");
        arlTest.add("L");
        arlTest.add("Y");
        arlTest.add("A");
        arlTest.add("N");
        arlTest.add("M");
        
        ArrayList<String> arlTest1 = new ArrayList<String>();
        
        arlTest1.add("S");
        arlTest1.add("A");
        arlTest1.add("M");
        arlTest1.add("R");
        arlTest1.add("A");
        arlTest1.add("T");
        arlTest1.add("M");
        
        
for(int i=0;i<arlTest.size();i++) {
      
      for(int j=0;j<arlTest1.size();j++) {
             
             str= arlTest.get(i)+" "+arlTest1.get(j);
             System.out.println(str);
      }
      
}
}
}               



