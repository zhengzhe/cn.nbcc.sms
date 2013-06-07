package cn.nbcc.sms.utils;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author  zhengzhe
 * @2013-5-7
 */
public class DateUtil {


	public static Date createDate(int y, int m, int d) {
		GregorianCalendar calendar = new GregorianCalendar(y,m-1,d);
		return calendar.getTime();
	}

}

