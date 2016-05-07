cpackage info.notsalty.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainSpring {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();//1. krok
		Calendar calendar = GregorianCalendar.getInstance(locale);//2.krok
		
		DateFormat formatter = SimpleDateFormat.getInstance();
		
		System.out.println(formatter.format(calendar.getTime()));
	}

}
