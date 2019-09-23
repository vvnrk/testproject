package com.bank.clientscreening.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

	public static Date getYesterdayDate() {
		Date date = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		c.set(Calendar.DATE, c.get(Calendar.DATE)-1);
				
		return c.getTime();
	}

}
