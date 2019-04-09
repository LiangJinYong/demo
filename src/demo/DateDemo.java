package demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

		String str1 = "2019-03-01 00:00:01";
		String str2 = "2019-03-02 23:59:59";

		Date date1 = df.parse(str1);
		Date date2 = df.parse(str2);

		long diff = date2.getTime() - date1.getTime();

		System.out.println(diff / (1000 * 60 * 60 * 24));

		Calendar cal = new GregorianCalendar();

		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		Date time = cal.getTime();
		
		System.out.println(time.getTime());
		
		Date now = new Date();
		System.out.println(now.getTime());
	}
}
