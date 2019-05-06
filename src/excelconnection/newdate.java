package excelconnection;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class newdate {

	public static void main(String[] args) throws Throwable {
		/*String dt = "2008-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		c.add(Calendar.DATE, 1);  // number of days to add
		dt = sdf.format(c.getTime());
		System.out.println(dt);*/
		
		 String myTime = "14:10";
		 SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		 Date d = (Date) df.parse(myTime); 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.MINUTE, 10);
		 String newTime = df.format(cal.getTime());
		 
		 System.out.println(newTime);
		

	}

}
