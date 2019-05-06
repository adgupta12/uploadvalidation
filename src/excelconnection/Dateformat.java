package excelconnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;


public class Dateformat {

	public static void main(String[] args) {
		Date myDate = new Date();
        System.out.println(myDate);
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(myDate));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
        System.out.println(myDate);
        
        
        System.out.println(new SimpleDateFormat("HH:mm").format(myDate));
        
        Formatter fmt = new Formatter();
     Calendar cal = Calendar.getInstance();

     fmt = new Formatter();
     fmt.format("%tl:%tM", cal, cal);


	}

}
